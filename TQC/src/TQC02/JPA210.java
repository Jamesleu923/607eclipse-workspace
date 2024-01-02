package TQC02;
import java.util.*;

public class JPA210 {
	  static Scanner keyboard = new Scanner(System.in);
	    public static void main(String[] args) {
	        //test();
	    	System.out.print("輸入一個字元:");
	    	//下面把第16,18,20行程式寫成一行 new Scanner(System.in).next().charAt(0)
	    	//把上述的那行其執行結果應為"字元",所以把上述那行丟給mytest,因為mytest接收字元
	    	System.out.println(mytest(new Scanner(System.in).next().charAt(0)));
	    }

	    public static void test() {
	    	System.out.println("Input a character:");
	        Scanner sc = new Scanner(System.in);
	        //讀取字串
	        String tm = sc.next();
	        //僅擷取自串的第一個字元
	        char tm0 = tm.charAt(0);
	        switch(tm0) {
	        case 'a'://這邊不需要特別去處理，因為沒有寫break，所以會繼續跑到case 'B'的內容，直到碰到break
	        case 'b':
	            System.out.println("You entered a or b");
	            break;
	        case 'x':
	            System.out.println("You entered x");
	            break;
	        case 'y':
	            System.out.println("You entered y");
	            break;
	        default:
	            System.out.println("You entered something else.");
	            break;
	        };
	        sc.close();
	   }
		
	    public static String mytest(char myinput) {
	    	
			String rtnstr=new String();
				switch (myinput) {
			      case 'a'->rtnstr="按a";
			      case 'b'->rtnstr="按b";
			      case 'x'->rtnstr="按x";
			      case 'y'->rtnstr="按y";
			      default->rtnstr="按到別的";
			    }						  
			return rtnstr;
		}
}
