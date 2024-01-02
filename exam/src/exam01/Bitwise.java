package exam01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Bitwise {

	public static void main(String[] args)  {
		var console=new Scanner(System.in);
		System.out.printf("請輸入您的出生民國年:");
		int year=0;
		try {
			year=console.nextInt();
		}
		catch (NumberFormatException ex) {
			System.out.println("請輸入一個整數!error code:01");		
		}
		catch (InputMismatchException e1) {
			System.out.println("請輸入一個整數!error code:02");
		}		
		finally {
			if (year!=0)
				System.out.printf("您的出生西元年為:%d", year+1911);
		}	
	}
}
