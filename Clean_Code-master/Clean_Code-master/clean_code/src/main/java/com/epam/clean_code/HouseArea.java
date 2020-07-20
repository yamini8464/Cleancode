package com.epam.clean_code;

import java.util.Scanner;

public class HouseArea {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("total area of house in square feet");
		int t = sc.nextInt();
		System.out.println("Choose the material required");
		System.out.println("1.standard material(Rs:1200INR)\n2.above Standard material(Rs:1500INR)\n3.High standard material(Rs:1800INR)\n");
		System.out.println("enter your choice in numbers\n");
		int ch = sc.nextInt();
		int cost = 0;
		if(ch>3) {
			if(ch == 1)
				cost = 1200;
			else if(ch == 2)
				cost = 1500;
			else if(ch == 3) {
				cost = 1800;
				System.out.println("Do You need Fully Automated or not\n1.(Fully Automated(Rs:700))\n2.Not Automated\n");
				System.out.println("enter your choice in number");
				int bool = sc.nextInt();
				if(bool == 1)
					cost = cost+700;
			}
			CostConstruction obj = new CostConstruction();
			System.out.println("Estimated House Construction cost"+obj.cost(t,cost));
		}else {
			System.out.println("your choice is invalid");
		}
	}

}
