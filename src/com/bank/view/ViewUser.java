package com.bank.view;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA_2_3.portable.OutputStream;

import com.bank.model.User;

public class ViewUser {
	// ArrayList al=new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(setInfo());
		//al.add(setInfo());
		//al.add(setInfo());
		//al.add(setInfo());
		//al.add(setInfo());
		
//System.out.println(al);
try {
	FileOutputStream file=new FileOutputStream("d://programscapg//bank.txt");
	ObjectOutputStream out=new ObjectOutputStream(file);
	out.writeObject(al);
	out.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//out.writeObject(al);
	}
	public static User setInfo()
	{
		User u=new User();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the details");
		u.setFirstname(sc.next());
		u.setAccnum(sc.nextLong());
		u.setAcctype(sc.next());
		u.setAddress(sc.next());
		u.setPancardnum(sc.next());
		u.setPhonenum(sc.nextLong());
		
		return u;
	}
	
	
	

}
