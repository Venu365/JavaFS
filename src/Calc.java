
public class Calc {
    void findArea()
    {
    	int b=2,h=3;
    System.out.println(0.5*b*h);	
    }
    void findArea(int s)
    {
    	System.out.println(s*s);
    }
    void findArea(float l,float b)
    {
    	System.out.println(l*b);
    }
    void findArea(double r)
    {
    	System.out.println(Math.PI*r*r);
    }
	
	public static void main(String[] args) {
		Calc ob=new Calc();
		ob.findArea();
		ob.findArea(5);
		
		ob.findArea(2.5f,3.5f);
		ob.findArea(3.5);
	}

}
