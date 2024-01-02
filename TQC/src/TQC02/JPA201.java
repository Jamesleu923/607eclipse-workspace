package TQC02;

import java.util.Scanner;

public class JPA201 {
    //下方keyboard物件 有宣告,有配置記憶體,且有用static關鍵字,請complier編譯器保留記憶空間
	//但是.....程式執行過程中,未使用到keyboard物件.
	static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter score");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        test(a);
        int b = sc.nextInt();
        test(b);

        sc.close();
    }
    //建立一個static的方法，來判斷是否有大於60
    public static void test(int c) {
        if(c>=60) 
        	System.out.println("及格!!");
        // if( 60<=c<=70) ---->高中數學, 嚴重錯誤,上課沒在聽!!!! 
        //拆成二部分來表示c介於60與70之間.中間用and運算子&&來串連. 
        // &&代表邏輯條件串接, 左方為真,且右方為真, &一個符號代表把左方跟右方做and邏輯閘計算
        // && 左右方條件,必須要用括號包住,如(c>=60)為條件一,(c<=70)為條件二
        // 最後,記得.....用&&邏輯條件串接的判別式,放入if條件後,
        //要用後方格式, if最外層要有括號, if (  (判別式一) && (判別二)  )
        // ||管道符號-->二個代表或者意思, shift+"鎮"
        
        if (  ((c>=60) && (c<70)) || (c<10)  )
        	System.out.println("要加油!");
        
        if (  (c>=70) && (c<80)   )
        	System.out.println("還不錯");

        if (  (c>=80) && (c<90)   )
        	System.out.println("很好");
            
        if   (c>=90) 
        	System.out.println("超優~!棒!!");
        
        System.out.println("End");
            
   }
}