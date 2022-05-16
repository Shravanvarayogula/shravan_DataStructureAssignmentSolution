package com.greatlearning.dsaassignmenttwo.service;

public class StackImplementation {
	private int MAX = 1000;
	int stack[];
	int top;
	StackImplementation (){
		top =-1;
	}
	StackImplementation (int size){
		this.MAX = size;
		stack = new int[MAX];
		}

	boolean isEmpty(){
		if (top == -1){
			return true;
		}
		return false;
	}

	boolean push(int x){
		if (top >= (MAX-1)){
			return false;
		}
		else {
			stack[++top] = x;
			return true;
		}
	}
	int pop(){
		if(top < 0 ){
			return -1;
		}
		else {
			int x = stack[top--];
			return x;
		}
	}
	int peek(){
		if (top < 0){
			return 0;
		}
		else {
			int x = stack[top];
		    return x;
		    }
	}
	void displayElements(){
		for(int i = top;i>-1;i--){
			System.out.print(" "+ stack[i]);
		}
	}
	int stackSize(){
		int size = 0 ;
		if (isEmpty()){
			return size;
		}
		else {
			while (!isEmpty()){
				size++;
			}
		}
		return size;
	}
}
