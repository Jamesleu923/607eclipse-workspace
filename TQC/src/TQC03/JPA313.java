package TQC03;
import java.lang.Math;
import java.util.Arrays;
public class JPA313 {

	public static void main(String[] args) {

        double[] StdScore= {77,25,88,46,33,57,90,24,95,19};
        //用for 迴圈走訪陣列,對每一筆成績開根號*10
        for (int i=0;i<StdScore.length;i++)
        	StdScore[i]=Math.sqrt(StdScore[i])*10;
        //排序
        Arrays.sort(StdScore);
        //用for 迴圈走訪陣列,印出每一筆成績,控制輸出每五筆換一列.
        for (int i=0;i<StdScore.length;i++) {
        	System.out.printf("第%d筆:%.2f,",i+1,StdScore[i]); 
        	if (i==4)               
                System.out.println();
        }        
        System.out.println();

        // 同上題，請根據上題加分及排序後結果，回答以下子題：下方程式作用為何? 
        double[] NewScore1=Arrays.copyOf(StdScore, 5);
        // Ans:取出前五個元素複製到NewScore1 陣列中.
        
        //同上題，請根據上題加分及排序後結果，回答以下子題：執行完後，NewScore1依序由小到大依序有哪些值?
        //請依序寫出前2個整數部分(不含小數點,不含小數位數)
        System.out.printf("NewScore1前二組資料:%f,%f%n", NewScore1[0],NewScore1[1]);
        
        //使用Math.floor無條件去除小數位
        System.out.printf("NewScore1前二組資料整數部分:%.0f 跟 %.0f%n", 
        		Math.floor(NewScore1[0]),Math.floor(NewScore1[1]));
        
        /*
         * 同上題，請根據上題加分及排序後結果，回答以下子題：
           下方程式執行完後，請用for..each迴圈印出NewScore1陣列中的資料，
          且每筆資料其小數位數應占2位(請使用printf函式配合小數位數控制)6% 
         */
        System.out.println("for..each迴圈印出NewScore1陣列中的資料");
        for (double score:NewScore1)
        	  System.out.printf("%.2f,",score);
        System.out.println();
        
        // 同上題，請根據上題加分及排序後結果，回答以下子題：下方程式作用為何?
        double[] NewScore2=Arrays.copyOfRange(StdScore, 4,6);
        System.out.println("NewScore2的資料");
        for (double score:NewScore2)
      	  System.out.printf("%.2f,",score);
      System.out.println();
        //從第4個元素copy 到第6個元素,且放入NewScore2陣列中.
        
        //同上題，請根據上題加分及排序後結果，回答以下子題：
        //執行完後，NewScore2依序由小到大，前五項有哪些值? (中間有逗號隔開) 10%
        
        //用for 迴圈走訪陣列,印出前五項.
        for (int i=0;i<NewScore2.length;i++) {
        	if (i<5)
        	   System.out.printf("第%d項:%.2f,",i+1,NewScore2[i]); 
        	else {
        		System.out.println();
        		break;
        	}
                
        }  
        
	}

}

