import java.lang.Math;
public class Circle extends Shape{
	
	private double length;
	public Circle(String figureName,double length)
	{
		super(figureName);
		setLength(length);
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public double getLength(){
		return length;
	}
	
	
	public double CalculateArea()
	{
		return (Math.PI * length * length);
	}
	
	public double CalculatePerimeter()
	{
		return (2 * Math.PI * length);
	}

}