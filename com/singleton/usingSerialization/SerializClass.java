package com.singleton.usingSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SerializClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton S1=Singleton.getInstance();
		
		/*FileOutputStream fis= new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\sample.java.txt");
		ObjectOutputStream ois =new ObjectOutputStream(fis);
		ois.writeObject(S1);
		
		
		FileInputStream f= new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\sample.java.txt");
		ObjectInputStream in =new ObjectInputStream(f);
		Singleton S2=(Singleton)in.readObject();
		
		
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());*/
				
		//****************************Reflection****************************
		
		Singleton S2= null;
		Constructor[] constructor=Singleton.class.getDeclaredConstructors();
		
		for(Constructor c:constructor) {
			c.setAccessible(true);
			S2=(Singleton)c.newInstance();
		}
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		
	}
	
}
