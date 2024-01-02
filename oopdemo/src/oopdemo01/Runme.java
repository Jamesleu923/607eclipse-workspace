package oopdemo01;

public class Runme {

	public static void main(String[] args) {
		/*
		 EmpNo,String EmpName,String Gender,float Height,float Weight,
		  String EducationLevel,String Position,int EmpDirector,int AnnualSalary
		 */
		Employee person1=new Employee(1,"Tomas","Male",180f,72f,"Mater","Manager",0,90000);
		Employee person2=new Employee(2,"Mary","Female",165f,48f,"Mater","Employee",1,30000);
		Employee person3=new Employee(3,"Carrey","Male",160f,72f,"Mater","Excute Manager",1,50000);
		/*叫物件編號,常不用到,改寫..用來印資料
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		*/				
		person1.toString("1");
		person2.toString();
		person3.toString("2");
		
		
		
		//,person1.getHeight(),person1.getWeight(),person1.getEducationLevel(),person1.getPosition(),person1.getAnnualSalary());
	
		
	}
}

/*
 * 		//clothes[] coat=new clothes[3];

		
		clothes TShirt01=new clothes();
		clothes TShirt02=new clothes();
		clothes TShirt03=new clothes();
		
		//TShirt01.size="S";
		//TShirt02.size="M";
		//TShirt03.size="L";
		//TShirt01.size="HEllo";
		TShirt01.setSize("S");
		TShirt02.setSize("B");
		TShirt03.setSize("xl");
		
		int i=0;
		System.out.printf("第%d件衣服,size:%s%n",++i,TShirt01.getSize());
		System.out.printf("第%d件衣服,size:%s%n",++i,TShirt02.getSize());
		System.out.printf("第%d件衣服,size:%s%n",++i,TShirt03.getSize());
		
		//TShirt01.price=199;TShirt02.price=199;TShirt03.price=199;
		//TShirt01.RGB[0]=128;TShirt01.RGB[1]=130;TShirt01.RGB[2]=140;
 * 
 * 
 */
