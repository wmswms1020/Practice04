package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[]num = new double[5];
		
		num[0] = sc.nextDouble();
		num[1] = sc.nextDouble();
		num[2] = sc.nextDouble();
		num[3] = sc.nextDouble();
		num[4] = sc.nextDouble();
		
		double avr = 0;
		int pcs = 0;
		
		for(int i=0; i<num.length; i++) {
			pcs++;
			avr += num[i];
		}
		System.out.println("평균은"+avr/pcs+"입니다.");
		
		
		
		
		
		
		
		
		sc.close();
	}

}
