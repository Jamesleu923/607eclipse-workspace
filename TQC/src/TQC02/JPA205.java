package TQC02;
import java.util.*;
public class JPA205 {
	 static Scanner input = new Scanner(System.in);
	    public static void main(String[] args) {
	        test235();

	    }
	    //寫一個方法來執行倍數判斷

	    static void test236() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //由大的數字開始判斷，如果判斷的數字是質數，則先後順序不影響程式。
	        
	        //先判斷是否是6的倍數，由最大的數開始判斷
	        if ((a%6)==0)
	            System.out.printf("%d是2、3、6的倍數\n",a);
	        //如果不是6的倍數，再判斷是否為2或3的倍數，其中判斷2或3的順序沒有差
	        else if ((a%2)==0)
	            System.out.printf("%d是2的倍數\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d是3的倍數\n",a);
	        else
	            System.out.printf("%d不是2、3、6的倍數\n",a);
	        

	        sc.close();
	   }
	    
	    static void test235() {
	        System.out.println("Enter an integer:");
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();

	        //由大的數字開始判斷，如果判斷的數字是質數，則先後順序不影響程式。
	        
	        //2*3*5=30
	        
	        if ((a%30)==0) //2*3*5=30
	            System.out.printf("%d是2、3、5的倍數\n",a);
	        else if ((a%15)==0)  //3*5=15
	            System.out.printf("%d是3、5的倍數\n",a);	 
	        else if ((a%10)==0)  //2*5=10
	            System.out.printf("%d是2、5的倍數\n",a);		
	        else if ((a%6)==0)  //2*3=6
	            System.out.printf("%d是2、3的倍數\n",a);		        
	        else if ((a%2)==0)
	            System.out.printf("%d是2的倍數\n",a);
	        else if ((a%3)==0)
	            System.out.printf("%d是3的倍數\n",a);
	        else if ((a%5)==0)
	            System.out.printf("%d是5的倍數\n",a);	        
	        else
	            System.out.printf("%d不是2、3、5的倍數\n",a);
	       
	        sc.close();
	   }	    

        static void test357() {
        	//自己寫..
        }
}

