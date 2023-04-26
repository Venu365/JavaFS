class X
{
	 int a=100;
	// final int a=100;
	void show()//method hiding
{
		a=a+100;//error
		System.out.println(a);		
}

}

public class MethodOverriding {

	public static void main(String[] args) {
	   X ob=new X();
	    ob.show();//200
	

	}

}
