package TQC01;
import java.util.Scanner;
public class JPA105 {

	public static void main(String[] args) {
		 System.out.print("請輸入您的姓名:");
	        Scanner sc = new Scanner(System.in);
	        String name = sc.next();
	        
	        System.out.printf("Hi, %s,請輸入您的銅板的個數:\n",name);
	        System.out.print("請輸入1元的數量:");
	        int n1 = sc.nextInt();
	        System.out.print("請輸入5元的數量:");
	        int n5 = sc.nextInt();
	        System.out.print("請輸入10元的數量:");
	        int n10 = sc.nextInt();
	        System.out.print("請輸入50元的數量:");
	        int n50 = sc.nextInt();

	        int sum,G0,G1,G2,G3,G4;
	        

	        sum = n1*1 + n5*5 + n50*50 +n10*10;
	        //G1=sum/1000;
	        //System.out.printf("sum=%d, G1=%d",sum,G1);
	        
	        G0=sum/10000;
	        //將總金額除以1000，小數點前面僅剩千位數這個數，並由浮點數存至整數，後面小數點皆會消失
	        G1 =  (sum/1000)%10;
	        //將總金額除以100，小數點前面僅剩千位數和百位數這兩數，再進行mod運算，除以10所餘的數，這樣便僅會存在百位數	        
	        G2 = (sum/100)%10;
	        //將總金額除以10，小數點前面僅剩千位數和百位數和十位數這三數，再進行mod運算，除以10所餘的數，這樣便僅會存在十位數
	        G3 = (sum/10)%10;
	        //將總金額進行mod運算，除以10所餘的數，這樣便僅會存在個位數
	        G4 = sum%10;
	        System.out.printf("您的錢總共有:%d 萬 %d 千 %d 百 %d 拾 %d 元",G0,G1,G2,G3,G4);
	        
	        sc.close();
	}

}
