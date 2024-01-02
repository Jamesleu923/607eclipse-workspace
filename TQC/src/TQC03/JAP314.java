package TQC03;
import java.lang.Math;
import java.util.Arrays;
public class JAP314 {

	public static void main(String[] args) {
		double[] StdScore= {12,34,55,60,8,100,80,34,65,59};
		double[] NewScore=Arrays.copyOf(StdScore,5);
		Arrays.sort(StdScore);
		for(int i = 0; i < StdScore.length; i ++) {
		/* for(double element : StdScore) {
			 double y=Math.sqrt(element);
			 System.out.println(y);	}*/
		 for(double element : NewScore) {
			 System.out.printf("%.2f%n",element);

	}
		}}}

