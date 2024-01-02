package TQC01;
//函式的同名異式: 同樣的函數名稱,但是接收的參數型別/參數個數/或回傳的型態不一樣,叫同名異式
public class JPA108 {

	public static void main(String[] args) {
		int i = add(2, 3);
		double d = add(5.2, 4.3);
		String s = add("I love ", "Java!!");

		System.out.printf("%d %f %s %n", i, d, s);
	}
	public static int add(int a, int b) {
		System.out.printf("Adding two integer: %d , %d \n",a,b);
		return (a+b);
	}

	public static double add(double a, double b) {
		System.out.printf("Adding two doubles: %2.1f , %2.1f \n",a,b);
		return (a+b);
	}

	public static String add(String a, String b) {
		System.out.printf("Adding two strings: %s, %s \n",a,b);
		return (a+b);
	}
}
