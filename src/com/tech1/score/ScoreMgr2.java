package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr2 {
	public static void main(String[] args) {
		ScoreMgr2[] scrArr=new ScoreMgr2[5];
		Scanner sc=new Scanner(System.in);
		double sum=0;
		while (true) {
			
		
		for (int i = 0; i < scrArr.length; i++) {
				System.out.println((i+1)+"��° �����Է�");
				int s=sc.nextInt();
				if ((s<50)||(s>100)) {
					System.out.println("�ٽ��Է�");
					i=i-1;
				}
				sum=s+sum;
				if (s==-1) {
				System.out.println("����ó�� ����"); break;
				}
		}
		System.out.println("���� �հ� : "+sum);
		System.out.println("��� : "+sum/5); //�������� �ʵ��� ��ұ�
		
		}
	}
}
