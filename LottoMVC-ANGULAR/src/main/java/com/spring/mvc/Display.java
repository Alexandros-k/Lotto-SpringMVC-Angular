package com.spring.mvc;

import java.util.List;

public class Display {
	private List <LottoBall> listOfLottoBalls;	
	
	public void printLottoBallList(List<LottoBall> winningNumbers) {				
		for (LottoBall lottoBall : winningNumbers) {
			int lottoBallNumber = lottoBall.getBallNumber();			
			display(lottoBallNumber);			
		}		
	}

	protected void display(int lottoBallNumber) {
		String message = "number"+" ";
		System.out.println(message + lottoBallNumber);		
	}	
}
