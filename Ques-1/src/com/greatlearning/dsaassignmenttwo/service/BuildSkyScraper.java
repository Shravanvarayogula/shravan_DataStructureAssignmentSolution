package com.greatlearning.dsaassignmenttwo.service;

import com.greatlearning.dsaassignmenttwo.service.StackImplementation;;

public class BuildSkyScraper {
	public void getDesignPlan(int nooffloors, int[] sequence){
		int currentfloor = nooffloors;
		int day =0,i=0;
		StackImplementation check = new StackImplementation(nooffloors);
		while (currentfloor <= nooffloors && i < sequence.length){
 			if (sequence[i] == currentfloor){
			 System.out.println("Day: "+ (day+1));
				check.push(sequence[i]);
				while(!check.isEmpty() && check.peek()> 0 && check.peek() >= currentfloor ){
					System.out.print(check.pop()+ " ");
					currentfloor--;
				}
				System.out.println();
			}
			else {
				System.out.println("Day: "+(day+1));
				System.out.println();
				check.push(sequence[i]);
			}
			day++;
			i++;
		}
	}
}


