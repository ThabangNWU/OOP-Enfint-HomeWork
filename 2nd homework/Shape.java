public class Shape implements ShapeInterface{
	
	private String figureName;
	
	public Shape()
	{
		this("");
	}
	public Shape(String figureName)
	{
		setName(figureName);		
	}
	
		
	public void setName(String figureName)
	{
		 this.figureName = figureName;
	}
	
	public String getName()
	{
		return figureName;
	}	
	
	@Override
	public double CalculatePerimeter()
	{
		return 0;
	}
	
	@Override
	public double CalculateArea()
	{
		return 0;
	}
}