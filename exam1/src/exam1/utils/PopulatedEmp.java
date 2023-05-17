package exam1.utils;

import java.util.HashMap;
import java.util.Map;

import exam1.Emp;
import exam1.exception.EmpExceptionHandling;

import static exam1.validation.EmpValidations.*;
public class PopulatedEmp {
	Map<Integer,Emp> emps1=new HashMap<>();
public static Map<Integer,Emp> populatedMap() throws EmpExceptionHandling{
	Map<Integer,Emp> emps1=new HashMap<>();
	//empno, ename, email, sal, city, d1, dept1
	emps1.put(101,validAllInputs(101,"shubham","ss@gmail.com",20000,"satara","2023-01-02","hr",emps1));
	emps1.put(103,validAllInputs(103,"sanket","sa@gmail.com",10000,"pune","2023-01-03","rnd",emps1));
	emps1.put(102,validAllInputs(102,"omkar","sb@gmail.com",30000,"mumbai","2023-01-04","sales",emps1));
	emps1.put(104,validAllInputs(104,"mohit","sc@gmail.com",40000,"pcmc","2023-01-05","production",emps1));
	
	return emps1;
	
}
}
