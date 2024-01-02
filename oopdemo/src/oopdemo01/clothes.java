package oopdemo01;

import java.util.Date;

public class clothes { //用class命名一個叫clothes 的類別
	//每一個類別之中,會有四種東西, 1.屬性,2.建構子,3.方法,4.事件.
	
	//以下都叫屬性-->描述一件衣服的形容詞. 傳統程式語言:變數
	private Date MakeData;
	private String size; //利用private 關鍵字封裝屬性,外面看不到
	public short[] RGB=new short[] {255,255,255};
	public float price;
	//類別是設計圖,需要使用建構子函式協助配置記憶體
	 //建構子:跟類別名字一樣,同名,的函數名稱, 叫做建構子函式
	public clothes() {
		
	}
	
	// Setter & Getter
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		String UserSetSize=size.toUpperCase();
		if (UserSetSize.equals("S") || UserSetSize.equals("M") 
				|| UserSetSize.equals("L") || UserSetSize.equals("XL"))
			this.size = UserSetSize;
		else
			this.size=null;
	}
	public Date getMakeData() {
		return MakeData;
	}
	public void setMakeData(Date makeData) {
		MakeData = makeData;
	}
		
}
