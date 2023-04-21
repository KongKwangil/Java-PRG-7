package kki2;

public class copyArrayTest {

	public static void main(String[] args) {
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		
		num2=num1;
		num2[2]=200;
		
		System.out.print("num1 values: ");
		
		for (int i:num1) //num1 출력
			System.out.print(i+" ");
		
			System.out.print("num2 values: ");
			
			for (int i:num2) //num2 출력
				System.out.print(i+" ");
			
			int num3[]= {100,200,300};
			int num4[]= {400,500,600};
			
			for(int i=0;i<num3.length;i++)
				num4[i]=num3[i];
			
			num4[2]=999; //num4[2]요소 값 변경
			
			
			
			
			
			
		}

	}


