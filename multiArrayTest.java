package kki2;

import java.util.Random;

public class multiArrayTest {

	public static void main(String[] args) {
		Random ran=new Random(); //난수 발생
		int[][] score=new int[4][4]; //2차원 배열 생성
		
		for(int i=0;i<4;i++) //행
			for (int j=0;j<4;j++) //열
				score[i][j]=ran.nextInt(10);//0~9까지 난수 발생
		
		for(int k=0;k<4;k++) {
			int sum=0;
		    for(int value:score[k]) {
		    	System.out.print(value+" ");
		        sum=sum+value; //행의 합계
		


	}
    System.out.print("sum is " +sum+"\n");//행의 합계를 출력
}
}
}