package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr2 {
	public static void main(String[] args) {
		ScoreMgr2[] scrArr=new ScoreMgr2[5];
		Scanner sc=new Scanner(System.in);
		double sum=0;
		while (true) {
			
		
		for (int i = 0; i < scrArr.length; i++) {
				System.out.println((i+1)+"번째 점수입력");
				int s=sc.nextInt();
				if ((s<50)||(s>100)) {
					System.out.println("다시입력");
					i=i-1;
				}
				sum=s+sum;
				if (s==-1) {
				System.out.println("성적처리 종료"); break;
				}
		}
		System.out.println("점수 합계 : "+sum);
		System.out.println("평균 : "+sum/5); //누적되지 않도록 어떡할까
		
		}
	}
}
