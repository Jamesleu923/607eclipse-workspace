package TQC02;
import java.util.*; //util-->utility java公用類別程式碼:java.util.*
//import java.util.Arrays;

public class JPA207 {
	static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
    	 
    	int[] x = {1,2,3,10,99,20};
    	Arrays.sort(x);
    	
    	for (int i=0;i<x.length;i++)
    		System.out.printf("data:%d%n", x[i]);
    		
        //test();

    }
    static void test() {

    	//三角形條件判斷，兩個短邊相加大於最大邊，並且其中一邊的數不可為零
    	System.out.print("請輸入三個整數:");
        Scanner sc = new Scanner(System.in);
        int[] n= new int[3];
    	n[0]=sc.nextInt(); //3
    	n[1]=sc.nextInt(); //5
    	n[2]=sc.nextInt(); //4
    
    	//證明它有排序
    	/*
    	System.out.println("使用者輸入值:");
    	for (int i=0;i<n.length;i++)
    	   System.out.printf("n[%d]=%d%n",i,n[i]);
    	
    	//使用Arrays.sort(n)，將陣列中的數字由小排到大
    	Arrays.sort(n);

    	System.out.println("叫用Arrays.sort排序後:");
    	for (int i=0;i<n.length;i++)
    	   System.out.printf("n[%d]=%d%n",i,n[i]);
    	*/
    	
    	//使用Arrays.sort(n)，將陣列中的數字由小排到大
    	Arrays.sort(n);    	
    	
    	//三角形條件判斷，兩個短邊相加大於最大邊，並且其中一邊的數不可為零
    	if(n[0]+n[1]>n[2] && n[0]*n[1]*n[2]!=0)
        	{
    		//直角三角形:較小的兩邊平方和等於最大邊的平方
        	if(n[0]*n[0]+n[1]*n[1]==n[2]*n[2])
        		System.out.print("直角三角形\n");
        	//鈍角三角形:較小的兩邊平方和小於最大邊的平方
        	else if(n[0]*n[0]+n[1]*n[1]<n[2]*n[2])
        		System.out.print("鈍角三角形\n");
        	//銳角三角形:較小的兩邊平方和大於最大邊的平方
        	else if(n[0]*n[0]+n[1]*n[1]>n[2]*n[2])
        		System.out.print("銳角三角形\n");
        	}
            //若無法構成三角形則進入此判斷式
    	else
        	System.out.print("不可以構成三角形\n");
    	
        
        sc.close();
    }
}
