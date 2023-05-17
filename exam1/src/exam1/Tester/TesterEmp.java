package exam1.Tester;

import static exam1.utils.IOUtils.*;
import static exam1.utils.PopulatedEmp.populatedMap;
import static exam1.validation.EmpValidations.validAllInputs;

import java.util.Map;
import java.util.Scanner;

import exam1.Emp;
import exam1.exception.EmpExceptionHandling;
public class TesterEmp {

	public static void main(String[] args) throws EmpExceptionHandling {
      try(Scanner sc=new Scanner(System.in);){
    	  boolean exit=false;
    	  Map<Integer,Emp> map= populatedMap();
    	  while(!exit) {
    		  try{
    			  System.out.println("0.exit,1.Add Employees,2.display Emp,3.display on empno,4.remove emp by id,5.natural sorting,6.custom sorting");
    			 switch(sc.nextInt()) {
    			 case 1:
    				 System.out.println("add employees ");
    				 System.out.println("empno, ename, email, sal, city, d1, dept1");
    			Emp e=validAllInputs(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next(),map);
    			map.put(e.getEmpno(), e);
    			System.out.println("Enter file name");
    			storedFile(sc.next(),map);
    			System.out.println("Emp add sucessfully");
    				 break;
    			 case 2:
    				 System.out.println("display emp");
    				 System.out.println("Enter file name");
    				 Map<Integer,Emp> map1=restoreFile(sc.next());
    				map1.values().stream().forEach(p->System.out.println(p)); 
    			//1	System.out.println(map);	 
    				 break;
    			 case 3:
    				 System.out.println("Display emp on id");
    				 System.out.println("enter the emp id...");
    				 Map<Integer,Emp> map2=restoreFile(sc.next());
    				 int id=sc.nextInt();
    				 System.out.println(map2.get(id));
    					//map.values().stream().forEach(p->System.out.println(p.getEmpno())); 
    				 break;
    			 case 4:System.out.println("remove emp");
    			 map.remove(sc.nextInt());
    			 System.out.println("Emp is removed....");
    				 break;
    			 case 5:
    				 System.out.println("sort by empid");
    				 map.values().stream().sorted();
    				 break;
    			 case 6:
    				 System.out.println("sort by date");
    				 map.values().stream().sorted((p1,p2)->((Double)p1.getSal()).compareTo(p2.getSal())).forEach(p->System.out.println(p));;
    				 break;
    			 case 0:
    				 exit=true;
    			 break;
    			 }
    		  }catch(Exception e) {
    			  e.printStackTrace();
    		  }
    	  }
      }

	}

}
