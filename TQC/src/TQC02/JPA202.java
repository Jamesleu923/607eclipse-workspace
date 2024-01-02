package TQC02;

import java.util.*;

public class JPA202{
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
       	test1();
        test1();
    }

    public static void test() {
    	System.out.println("Input:");
        Scanner sc = new Scanner(System.in);
        int a,b;
     
        a = sc.nextInt();
        b = sc.nextInt();
        //建立條件判斷式，結果可能有三種狀況，a>b，a=b，a<b，所以判斷式處理如下
        //if..else if ..else結構,只會跑其中一組,如果全部都不符合,則會跑最後一組else      
        if(a>b)
        	System.out.printf("%d is larger than %d\n",a,b);
        else if(b>a)
        	System.out.printf("%d is larger than %d\n",b,a);
        else
        	System.out.printf("%d is equal to %d\n",a,b);

        sc.close();

    }
    public static void test1() {
    	//if ..else if ..else if...else if ...else
    	//中間可以有無限個else if ...
    	//但是最後一組,一定是else,第一組一定是if
    	
    	System.out.println("請輸入分數:");
        Scanner sc = new Scanner(System.in);
        int c;
        c = sc.nextInt();
        if (c>=90)
        	System.out.println("很棒!");
        else if (c>=80)
        	System.out.println("很好!");
        else if (c>=70)
        	System.out.println("可以");
        else if (c>=60)
        	System.out.println("好家在及格了!");
        else
        	System.out.println("不及格!");
        

        sc.close();

    }    
}