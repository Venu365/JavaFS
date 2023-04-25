class A
{
int a=10,b=20;	
}
class B extends A
{
	int a=100,b=200;
	void sum(int a,int b)
	{
System.out.println(a+b);//3000
System.out.println(this.a+this.b);//300
System.out.println(super.a+super.b);//30
	}
	
}
public class SingleInheritanceEx {

	public static void main(String[] args) {
		B ob=new B();// Hello
       ob.sum(1000,2000);

	}

}
