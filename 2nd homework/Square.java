public class Square extends Shape{
	
	private double length;
	public Square(String figureName,double length)
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
		return length * length;
	}
	
	public double CalculatePerimeter()
	{
		return length * 4;
	}
	
	
}