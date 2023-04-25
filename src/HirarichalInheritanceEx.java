class Shape
{
double l=2.3,b=5.6,h=4.7;	
	
}
class Reactangle extends Shape
{
void calArea()
{
System.out.println("area of rectangle: "+l*b);	
}
}
class Traingle extends Shape
{
	void calArea()
	{
	System.out.println("area of traingle: "+0.5*b*h);	
	}	
}
public class HirarichalInheritanceEx {

	public static void main(String[] args) {
		Reactangle r=new Reactangle();
		r.calArea();
		Traingle t=new Traingle();
		t.calArea();

	}

}
