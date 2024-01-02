package TQC03;
import java.util.Scanner;
public class JPA312 {
	public static void main(String[] args) {
		 Scanner UserInput = new Scanner(System.in);
		 int WeatherType; float Temperature;
		 
		 System.out.print("請輸入天氣型態:");
		 WeatherType=UserInput.nextInt();
		 System.out.println("請輸入氣溫:");
		 Temperature=UserInput.nextFloat();
		 
		 if (WeatherType==1)
			 System.out.println("注意防曬");
		 else
		     System.out.println("建議帶雨具");
		 
		 if (Temperature>=26)
			 System.out.println("高溫炎熱,補充水份");
		 else if (Temperature>=16)
			 System.out.println("氣溫舒是,薄外套");
		 else
			 System.out.println("低溫來襲");
		 
		 UserInput.close();
	}

}
