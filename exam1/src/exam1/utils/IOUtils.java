package exam1.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import exam1.Emp;

public interface IOUtils  {
public static void storedFile(String filename,Map<Integer,Emp> emps) throws IOException {
	try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
		out.writeObject(emps);
	}
}




public static Map<Integer,Emp> restoreFile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
	
	try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))){
		
	return (Map<Integer,Emp>)in.readObject();
	}
}
}
