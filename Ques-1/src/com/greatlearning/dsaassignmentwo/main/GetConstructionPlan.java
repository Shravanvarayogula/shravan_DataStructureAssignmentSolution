package com.greatlearning.dsaassignmentwo.main;

import java.util.Scanner;

import com.greatlearning.dsaassignmenttwo.service.BuildSkyScraper;;

public class GetConstructionPlan{
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the Total No of Floors in the Building");
		int number_of_floors = user_input.nextInt();
		if (number_of_floors == 0){
			System.out.println("Enter Number of floors > 0");
		}
		else {
			int[] floor_order = new int[number_of_floors];
			int i;
			for(i=0;i< number_of_floors;i++){
				System.out.println("Enter Floor Size given on day: " +(i+1));
				floor_order[i]= user_input.nextInt();
			}
			user_input.close();
			BuildSkyScraper bs = new BuildSkyScraper();
			System.out.println("Fetching Construction Assembly Plan");
			bs.getDesignPlan(number_of_floors, floor_order);
		}
	}

}
