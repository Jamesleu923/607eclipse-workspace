package TQC01;
import java.util.Scanner;

public class JPA102 {

	public static void main(String[] args) {
		System.out.println("(請輸入英磅數值:)Please input ponds: ");
	
		//使用Scanner這個方法來讀取鍵盤輸入
		//1公斤=2.20462磅
		//1磅=0.454 公斤
		//double k = Double.parseDouble(new Scanner(System.in).next()) ;
		
		Scanner sc;
		sc=new Scanner(System.in);	
		
		double k=sc.nextDouble();
		System.out.println(k+"英磅ponds = "+ (k*0.454) + "  公斤kg ");		
		System.out.printf("%.3f 英磅ponds equal to %.3f 公斤kg%n", k, k*0.454);		
		 sc.close();
	}

}

/*
 * 		//變數: 整數int,整數物件Integer,浮點數float,浮點數物件用Float
		//倍精確度變數double,倍精確度物件Double
		//字串 String 字串物件StringBuilder
		
 		int score=90;
		Integer MyChineseTestScore=98;
		
		float myheight=173.2f;
		Float MaryHeight=150.7f;
		
		double myMoney=50.12323;
		Double myMotherMoney=100.23;
		
		String myName="James";
		StringBuilder MyFatherName=new StringBuilder();
		MyFatherName.append("James");
				System.out.println("Please input請輸入名字:");
		String name=sc.next();
		
		System.out.println("你的名字是:"+name.toString());
 */
