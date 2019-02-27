package com.bank.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.model.User;

public class Validate {
	//static ArrayList al=new ArrayList();
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	//	ArrayList al=new ArrayList();
		//al.add(setInfo());
		//al.add(setInfo());
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter adhar");
		int num=sc.nextInt();
		for(int i=0;i<2;i++)
		{
		if(contains(num))
		{
			System.out.println("exists");
		}
		else
			System.out.println("successfully registered");

		}
		
	}

		
		
	}


