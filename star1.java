package star;
import java.util.Scanner;
public class star1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력하세요: ");
		int num = stdin.nextInt();
		int i=1;
		while(i<=num)
		{
			int j=num;
			while (i <= j)
			{
				System.out.print("*");
				j--;
			
			}
			System.out.println();
			i++;
		}

	}

}
