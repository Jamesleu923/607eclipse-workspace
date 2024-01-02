package sample;
public abstract class AbstractDisplay { //抽象類別AbstractDisplay
	private String myword;
    public String getMyword() {
		return myword;
	}
	public void setMyword(String myword) {
		this.myword = myword;
	}
	public AbstractDisplay() {
		System.out.println("爸爸建構子函式..進行初始化..");
		//初始化程式碼打下方..
		
	}
    protected void test() {
    	System.out.println("爸爸叫:test...");
    }
	public abstract void open();        // 由子類別實作的抽象方法（1）open
    public abstract void print();       // 由子類別實作的抽象方法（2）print
    public abstract void close();       // 由子類別實作的抽象方法（3）close
    public final void display() {       // 在此抽象類別中實作的方法display
        open();                             // 先open…
        for (int i = 0; i < 3; i++) {       // 反覆5次print…
            print();                    
        }
        close();                            //…最後close起來。這就是實作display方法時的內容
    }
}
