package TQC03;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class JPA311 {

	public static void main(String[] args) {
		 //二個for迴圈的初始值,條件值,終止值,內迴圈的值來自於第一個 ,ex Bubble sort
		 //泡沬排序法
		 int[] mynumber= {10,67,90,23,12,90,100,33,65,59,78,92};
		 System.out.println("未排序前");
		 for (var i:mynumber)
			 System.out.printf("%d,",i);
		 System.out.println();
		 
		 System.out.println("排序後");
		 //bubble sort,泡沬排序,效能最差,最好學
		 /*
		 int temp=0;
		 for (int i=0;i<mynumber.length;i++)
			 for (int k=i+1;k<mynumber.length;k++) {
				 if (mynumber[i]>mynumber[k]) {
					 temp=mynumber[i];
					 mynumber[i]=mynumber[k];
					 mynumber[k]=temp;
				 }
			 }
		 */
		 Arrays.sort(mynumber);
		 
		 for (var i:mynumber)
			 System.out.printf("%d,",i);
		 System.out.println(); 

		 //利用for迴圈反轉
		 System.out.println("利用for迴圈由大到小");
		 for (int i=mynumber.length-1;i>=0;i--) {
			 System.out.printf("mynumber[%d]=%d,",i,mynumber[i]);
			 if (i%4==0)
				 System.out.printf("%n");
		 }
		    
		 
		 System.out.println();
		 //利用arrayulist反轉
		 System.out.println("利用arrayulist反轉");
		 ArrayList mynubmerlist=new ArrayList();
		 for (var i:mynumber)
			 mynubmerlist.add(i);
		 Collections.reverse(mynubmerlist);
		 System.out.println("反轉:"+mynubmerlist);

	}

}
