package TQC01;
import java.util.Scanner;
public class JPA103 {

	public static void main(String[] args) {
		System.out.println("Please input:");
		Scanner sc = new Scanner(System.in);
		//Scanner在讀取的時候會以空白為區隔
		int a,b;
		float c;
		//String name;

		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextFloat();
		//name=sc.next();
		
		//這邊記得要將三個變數之和強制轉型成double，這樣除出來的數字才會是浮點數
		System.out.printf("Average: %5.2f",((double)(a+b+c)/3));
		 sc.close();

	}

}
