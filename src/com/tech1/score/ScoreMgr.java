package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {
	public static void main(String[] args) {
		ScoreMgr[] scrArr=new ScoreMgr[5];
		Scanner sc=new Scanner(System.in);
		double sum=0;
		for (int i = 0; i < scrArr.length; i++) {
			System.out.println((i+1)+"번째 점수입력");
			int s=sc.nextInt();
			sum=s+sum;
		}
		System.out.println("점수 합계 : "+sum);
		System.out.println("평균 : "+sum/5);
		
	}
}
