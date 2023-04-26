class A {
	void sum(int...a) {
		int s=0;
	for(int ele: a)
		s=s+ele;
	System.out.println(s);
	}

	
}

public class MethodOverLoad {

	public static void main(String[] args) {
		A ob = new A();
		ob.sum();//0
		ob.sum(12, 15);//27
		ob.sum(2, 6, 10);//18

	}

}
