package com.home.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제5
		//메뉴1 주사위 크기 5~10을 받고 범위 벗어날 경우 범위 안내 메시지
		//메뉴2 5가 나올때까지 주사위 굴린 횟수
		//메뉴3 메뉴2에서 각 주사위 수별로 몇번 나왔는지
		//메뉴4 메뉴 2에서 가장 많이 나온수 몇인지 구하고 출력
		//     가장 많이 나온 수가 여러개 일 경우 가장 작은 수가 출력
		//메뉴5 프로그램 종료
		Scanner sc=new Scanner(System.in);
		boolean flag = true;
		int[] dice = null;
		int size =0;
		int count =0;
		int five =0;
		int max=0;
		int idx=0;
		int result=0;
		while(flag) {
		System.out.println("==1.주사위 크기 2. 주사위 굴리기 3. 결과보기 4. 가장 많이 나온 수 5. 종료==");	
		int num=Integer.parseInt(sc.nextLine());
			
		switch(num) {
		case 1:
			System.out.println("주사위 크기>");
			size = Integer.parseInt(sc.nextLine());
			dice = new int[size];
			if(size<5||size>10) {
				System.out.println("주사위는 5~10까지의 크기로 입력해주세요");
				size=0;
			}
			break;
		case 2:
			for(int i=0;i<1000;i++) {
				five=(int)(Math.random()*size)+1;
				dice[five-1]++;
				count++;
				if(five==5) {
					System.out.println("5가 나올 때까지 주사위를"+count+"번 굴렸습니다.");
					break;
				}
			}
			break;
		case 3:
			for(int i=0;i<dice.length;i++) {
				System.out.println(i+1+"은 "+dice[i]+"번 나왔습니다.");
				if(dice[i]>max) {
					max=dice[i];
					idx++;
				}
			}
			break;
		case 4:
			for(int i=0;i<dice.length;i++) {
				if(dice[i]==max) {
				result++;
				}}
				if(result>1) {
					System.out.println("가장 작은 수는 1입니다.");
				}else if(result==1) {
					System.out.println("가장 많이 나온 수는 "+idx+"입니다.");
				}
			
			break;
		case 5:
			System.out.println("프로그램 종료");
			flag=false;
			
		}
		}
		

	}

}
