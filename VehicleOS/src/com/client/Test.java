package com.client;

import java.util.Scanner;

import com.service.Pune;
import com.service.Rto;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Rto p1=new Pune();
		while(true) {
			System.out.println("Welcome to Vehicle registeration system\nOptions");
			System.out.println("1.register Your Vehicle\n2.View Your Vehicle\n3.Update your details");
			System.out.println("What is Your Choice");
			int ch=s.nextInt();
			switch(ch) {
			case 1:
				p1.regVehicle();
				break;
			case 2:
				p1.viewDetails();
				break;
			case 3:
				p1.updateVehicle();
				break;
			
				
		}
		

	}

}
}