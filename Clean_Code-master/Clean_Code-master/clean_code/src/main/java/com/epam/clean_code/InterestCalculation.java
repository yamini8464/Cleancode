package com.epam.clean_code;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount");
		float p,t,r;
		p = sc.nextFloat();
		System.out.println("enter time");
		t = sc.nextFloat();
		System.out.println("enter rate of interest");
		r = sc.nextFloat();
		Calculation obj=new Calculation(p,t,r);
		System.out.println("Simple Interest"+obj.SI());
		System.out.println("Compound Interest"+obj.CI());
		}
	}
