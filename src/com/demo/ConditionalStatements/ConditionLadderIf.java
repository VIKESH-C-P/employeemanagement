package com.demo.ConditionalStatements;

public class ConditionLadderIf {

	public static void main(String[] args) {
		
		int num=23;
		if(num <=100 && num>80) {
		  System.out.println("A grade");
		}
		else if(num <=80 && num>70) {
		  System.out.println("B grade");
		}
		else if(num <=70 && num>60) {
		  System.out.println("C grade");
		}
		else if(num <=60 && num>45) {
		  System.out.println("D grade");			
		}
		else {
		  System.out.println("F grade");			
		}

	}

}
