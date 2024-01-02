package TQC03;
import java.util.*;

public class JPA301 {

	 public static void main(String argv[]) {
	        System.out.println("Input:");
	        
	        //二列式寫法//
	        //Scanner sc=new Scanner(System.in);
	        //int tm1 =sc.nextInt();
	        
	        //併成一列的寫法//
	        int tm =new Scanner(System.in).nextInt();
	        
	        int sum = 0 ;
	        //從1開始加，且變數會一直+1再加入總和，直到變數大於使用者輸入的數便停止
	        /*
	        for (int a=1;a<=tm ; a++) {
	            sum = sum+a;
	        }
	        */
	        sum=((1+tm)*tm)/2;
	        System.out.printf("1 + ... + %d = %d",tm,sum);
	    }
	 
 public static void test(){
 		
	 //for迴圈的初始值,條件值,終止值,中間請用分號隔開
     //case 1: test印10次
	 for (int i=0;i<10;i++)
	 	System.out.println("test");
	
    //case 2: test印10次
	  int j;
	  for (j=0;j<10;j++)
		System.out.println("test");
	  
	//for迴圈的初始值,條件值,終止值,判斷條件,有沒有等號??
	 for (int i=0;i<=10;i++)
	    	System.out.println("test");
	 
	 //二個for迴圈的初始值,條件值,終止值,
	 for (int i=0;i<10;i++)
		 for (int k=0;k<10;k++)
	    	    System.out.println("test");

	 //二個for迴圈的初始值,條件值,終止值,內迴圈的值來自於第一個 ,ex Bubble sort
	 //泡沬排序法
	 int[] mynumber= {10,67,90,23,12,90,100,33,65,59};
	 int temp=0;
	 for (int i=0;i<10;i++)
		 for (int k=i+1;k<10;k++) {
			 if (mynumber[i]<mynumber[k]) {
				 temp=mynumber[i];
				 mynumber[i]=mynumber[k];
				 mynumber[k]=temp;
			 }

		 }	    	    
	 //注意 for迴圈中加上if判別式以及break;countiune;
	 //https://openhome.cc/Gossip/JavaGossip-V1/BreakContinue.htm
	 
	 
  } //end of test function

	
}




/*
//case 99 do..while
int x=10;
do{
System.out.print("value of x : " + x );
x++;
System.out.print("123");
}while( x < 20 );
}
*/