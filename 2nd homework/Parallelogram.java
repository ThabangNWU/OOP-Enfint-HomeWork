import java.lang.Math;
public class Parallelogram extends Shape
{
	private double height;
	private double breadth;
	private double angle;
	public Parallelogram(String figureName,double height, double breadth, double angle )
	{
		super(figureName);
		setHeight(height);
		setBreadth(breadth);
		
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	public void setAngle(double angle)
	{
		this.angle = angle;
	}
	
	public double getAngle(){
		return angle;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getBreadth(){
		return breadth;
	}	
	
	public double CalculateArea()
	{
		return height * breadth * Math.sin(Math.toRadians(angle));
	}
	
	public double CalculatePerimeter()
	{
		return breadth * height;
	}

}