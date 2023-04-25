private class Student
{
int rno;
String name;
String clgName;
void read(int rno,String name,String clgName)
{
	this.rno=rno;
	this.name=name;
	this.clgName=clgName;
}
}
class StudentMarks extends Student
{
int m1=98,m2=78,m3=85;
int calTotalMarks()
{
	return m1+m2+m3;
}
}
class StudentMemo extends StudentMarks
{
void printMemo()
{
	System.out.println("Name: "+name);
	System.out.println("Roll No: "+rno);
	System.out.println("College Name: "+clgName);
	System.out.println("Total Marks: "+calTotalMarks());
}
	
}
public class MultiLevelEx {

	public static void main(String[] args) {
		StudentMemo m=new StudentMemo();
		m.read(120,"kiran","jntuk");
		m.printMemo();

	}

}
