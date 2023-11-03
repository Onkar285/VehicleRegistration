package com.service;

import java.util.Scanner;

import com.model.Vehicle;

public class Pune implements Rto {
	
	Vehicle v=new Vehicle();
	Scanner s=new Scanner(System.in);
	
	@Override
	public void regVehicle() {
		
		System.out.println("Enter registration Id:");
		v.setRegId(s.nextInt());
		System.out.println("Enter Model Name:");
		s.nextLine();
		v.setModelName(s.nextLine());
		System.out.println("Enter your price");
		//s.nextFloat();
		v.setPrice(s.nextFloat());
		System.out.println("Enter Your Colour");
		s.nextLine();
		v.setColour(s.nextLine());
		System.out.println("Enter Your Area");
		
		v.setArea(s.nextLine());
		System.out.println("Enter Owername");
		
		v.setOwnerName(s.nextLine());;
		System.out.println("Enter Your Mobile Number");
		//s.next();
		v.setMob(s.nextLong());
		System.out.println("Enter Your Aadhar Number");
		//1s.next();
		v.setAadhar(s.nextLong());
		
	}
	
	@Override
	public void viewDetails() {
		
		System.out.println("REG ID="+v.getRegId());
		System.out.println("MODEL NAME="+v.getModelName());
		System.out.println("PRICE="+v.getPrice());
		System.out.println("COLOUR="+v.getColour());
		System.out.println("AREA="+v.getArea());
		System.out.println("OWNWERNAME="+v.getOwnerName());
		System.out.println("MOBILE NAME="+v.getMob());
		System.out.println("AADHAR NUMBER="+v.getAadhar());
		
	}
	
	@Override
	public void updateVehicle() {
		
		System.out.println("1.update price\n2.update owner name");
		System.out.println("Enter choice");
		int ch=s.nextInt();
		switch(ch){
			case 1:
				System.out.println("Update price");
				float pr=s.nextFloat();
				v.setPrice(pr);
				System.out.println("price update succesfully");
				break;
			case 2:
				System.out.println("Update owner name");
				String ow=s.next();
				v.setOwnerName(ow);;
				System.out.println("owner name change succesfully");
				break;	
			
				
				
			default:
				System.out.println("invalid choice");
			
		}
	}
	

}
