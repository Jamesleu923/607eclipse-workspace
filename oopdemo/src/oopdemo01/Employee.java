package oopdemo01;

public class Employee {


	 private int EmpNo,AnnualSalary;
	 private int EmpDirector;
	 private String EmpName,Gender,EducationLevel,Position;
	 private float Height,Weight;
	 
	 public Employee(int EmpNo,String EmpName,String Gender,
			 float Height,float Weight,String EducationLevel,String Position,int EmpDirector,int AnnualSalary)
	 {
		 this.setEmpNo(EmpNo);
		 this.setEmpName(EmpName);
		 this.setGender(Gender);
		 this.setHeight(Height);
		 this.setWeight(Weight);
		 this.setEducationLevel(EducationLevel);
		 this.setPosition(Position);
		 this.setEmpDirector(EmpDirector);
		 this.setAnnualSalary(AnnualSalary);
		 
	 }
	 public Employee() {}

	 
	 public String toString() {
		 System.out.printf("EmpNO:%d,EmpName:%s,Gender:%s%n",this.getEmpNo(),this.getEmpName(),this.getGender());
		 System.out.printf("Height:%.2f,Weight:%.2f,EducationLevel:%s%n",this.getHeight(),this.getWeight()
				 ,this.getEducationLevel());
		 return "1";
	 }
	 public String toString(String a) {
		 System.out.printf("EmpNO:%d,EmpName:%s,Gender:%s%n",this.getEmpNo(),this.getEmpName(),this.getGender());
		 return "1";
	 }
	 
	 // Getter Setter
	 public int getEmpNo() {
		return EmpNo;
	}

	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}



	public int getAnnualSalary() {
		return AnnualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		AnnualSalary = annualSalary;
	}

	public Integer getEmpDirector() {
		return EmpDirector;
	}

	public void setEmpDirector(Integer empDirector) {
		EmpDirector = empDirector;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String nmpName) {
		EmpName = nmpName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEducationLevel() {
		return EducationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		EducationLevel = educationLevel;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public float getHeight() {
		return Height;
	}

	public void setHeight(float height) {
		Height = height;
	}

	public float getWeight() {
		return Weight;
	}

	public void setWeight(float weight) {
		Weight = weight;
	}
}
