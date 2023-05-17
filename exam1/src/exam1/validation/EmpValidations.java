package exam1.validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import exam1.Dept;
import exam1.Emp;
import exam1.exception.EmpExceptionHandling;

public class EmpValidations {

public static Emp validAllInputs(int empno, String ename, String email, double sal, String city, String date,String dept,Map<Integer,Emp>emps) throws EmpExceptionHandling {
	
	checkForDuplicate( empno, emps);
	LocalDate d1=validateDate( date);
	Dept dept1=checkForDepartment( dept);
	
	return new Emp(empno, ename, email, sal, city, d1, dept1);
	
}
	
	
	
	
	public static void checkForDuplicate(int id,Map<Integer,Emp> emps) throws EmpExceptionHandling {
		if(emps.containsKey(id))
			 throw new EmpExceptionHandling("Duplicate id found....");
		System.out.println("no duplicates found....");
	}
	
	public static LocalDate validateDate(String date) throws EmpExceptionHandling {
		LocalDate d=LocalDate.parse(date);
		int years=Period.between(LocalDate.now(), d).getYears();
		if(years >3)
			 throw new EmpExceptionHandling("Exprience not valid...");
		return d;
		
	}
	
	public static Dept checkForDepartment(String dept) {
		return Dept.valueOf(dept.toUpperCase());
		
	}
}
