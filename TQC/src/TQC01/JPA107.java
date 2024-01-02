package TQC01;
//直接叫用類別內的方法時,不用newy 配置Memory,但是....被叫用的方法,必須加上static靜態關鍵字
public class JPA107 {

	public static void main(String[] args) {
		
		//Basketball base1=new Basketball();
		
		 int action = 1, skill = 2, teamgame = 3;
	        System.out.println("The basketball grade is " + Basketball.calGrade(action,skill,teamgame));
	        System.out.println("The baseball grade is " + Baseball.calGrade(skill,teamgame));
	}
}
//建立一個class
class Basketball {
	//在裡面再建立一個方法，並宣告成static
  public static int calGrade(int a,int s,int t) {
      return a + s + t;
  }
}

class Baseball {
	public static int calGrade(int s,int t) {
      return 10 + s + t;
  }
}