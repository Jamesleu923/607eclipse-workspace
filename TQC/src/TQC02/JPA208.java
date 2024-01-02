package TQC02;
import java.util.*;
public class JPA208 {
	
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
    }

    //建立分數判斷的方法，在main方法中，宣告五次，便執行五次
    public static void test()  {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        try {
        	
            float a = sc.nextFloat();
            //使用條件判斷式，"if" "else if" "else"，因為一定只能符合其依規則，不能用多個if來判斷
            //這邊使用漏斗的寫法，如果沒有大於等於90那該數一定小於90往下繼續執行，那底下便只需寫判斷大於等於80即可，不用再判斷是否小於90            
            // *****漏斗寫法  ***/     
            if(a>=90)
            	System.out.printf("Your grade is A\n");
            else if(a>=80)
            	System.out.printf("Your grade is B\n");
            else if(a>=70)
            	System.out.printf("Your grade is C\n");
            else if(a>=60)
            	System.out.printf("Your grade is D\n");
            else if(a<60)
            	System.out.printf("Your grade is F\n");
            else
                System.out.printf("grade input ERROR\n");
            
        } catch (InputMismatchException ex) {
        	
        	System.out.println("請不要亂KEY,我要數值!!!");
        	return;
        }

        sc.close();


        
        /*
        if(a>=90)
        	System.out.printf("Your grade is A\n");
        if (a<90 && a>=80)
        	System.out.printf("Your grade is B\n");
        if (a<80 && a>=70)
        	System.out.printf("Your grade is C\n");
        if (a<70 && a>=60)
        	System.out.printf("Your grade is D\n");
        if (a<60 )
        	System.out.printf("Your grade is E\n");
        */        	

    }
}
