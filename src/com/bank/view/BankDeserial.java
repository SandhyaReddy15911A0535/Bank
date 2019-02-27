package com.bank.view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class BankDeserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream file=new FileInputStream("d://programscapg//bank.txt");
	ObjectInputStream out=new ObjectInputStream(file);
	//User user=((User)out.readObject());
	ArrayList<User> list=(ArrayList<User>)out.readObject();
	User b=new User();
	//b=list.get(0);
	//System.out.println(b.getFirstname()+" "+b.getAccnum());
	//if(b.getAccnum==num)
	//{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter adhar");
	long num=sc.nextLong();
		for(int i=0;i<list.size();i++)
		{
			b=list.get(i);
			if(b.getAccnum()==num)
			
				System.out.println("exists");
			else
				System.out.println("successfully registerd");
		}
	//}
	//System.out.println();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
