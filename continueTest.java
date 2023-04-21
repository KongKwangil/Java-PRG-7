package kki2;

import java.util.Scanner;

public class continueTest {
	
	

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		System.out.print("input number: ");
		int num=stdin.nextInt();
		int i=0, sum=0;
		
		while (i<=100)
		{
			i++;
			if(i%num!=0)
				continue;
			
			sum=sum+i; // num의 배수만 더하기
		}
				System.out.print("multiples of 1~100 sum:" +sum);
		
	}

}
