
public class Calculate {
	void calc(int a)
	{
		System.out.println(a*a);
	}
    void calc(double a)
    {
    	System.out.println(Math.sqrt(a));
    }
	public static void main(String[] args) {
		Calculate ob=new Calculate();
		ob.calc(4);
		ob.calc(36.00);

	}

}
