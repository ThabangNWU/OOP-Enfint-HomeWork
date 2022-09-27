public class Rectangle extends Shape{
	
	private double height;
	private double width;
	public Rectangle(String figureName,double height, double width )
	{
		super(figureName);
		setHeight(height);
		setWidth(width);
		
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}	
	
	public double CalculateArea()
	{
		return height * width;
	}
	
	public double CalculatePerimeter()
	{
		return height * 2 + width *2;
	}

}