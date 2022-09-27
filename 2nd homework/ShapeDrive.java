public class ShapeDrive
{

private static void DisplayCircle(Circle isCircle)
{
	System.out.println("The name of shape is "+isCircle.getName()+" perimeter is " +isCircle.CalculatePerimeter()+" area is "+ isCircle.CalculateArea());
}
private static void DisplayRect(Rectangle isRect)
{
	System.out.println("The name of shape is "+isRect.getName()+" perimeter is " +isRect.CalculatePerimeter()+" area is "+ isRect.CalculateArea());
}

private static void DisplaySquare(Square isSquare)
{
	System.out.println("The name of shape is "+isSquare.getName()+" perimeter is " +isSquare.CalculatePerimeter()+" area is "+ isSquare.CalculateArea());
}

private static void DisplayTriangle(Triangle isTriangle)
{
	System.out.println("The name of shape is "+isTriangle.getName()+" perimeter is " +isTriangle.CalculatePerimeter()+" area is "+ isTriangle.CalculateArea());
}

private static void DisplayParallelogram(Parallelogram isParallelogram)
{
	System.out.println("The name of shape is "+isParallelogram.getName()+" perimeter is " +isParallelogram.CalculatePerimeter()+" area is "+ isParallelogram.CalculateArea());
}



public static void main(String[] args)
{
	Circle[] myCircle = new Circle[2];
	myCircle[0] = new Circle("Circle",3.00);
	myCircle[1] = new Circle("Circle",5.00);
	Rectangle[] myRect = new Rectangle[2];
	myRect[0] = new Rectangle("Rectangle",7, 2 ) ;
	myRect[1] = new Rectangle("Rectangle",5, 6 ) ;
	Square[] mySquare = new Square[2];
	mySquare[0] = new Square("Square",6);
	mySquare[1] = new Square("Square",4);
	Triangle[] myTriangle = new Triangle[2];
	myTriangle[0] = new Triangle("Triangle" , 4, 3, 5);
	myTriangle[1] = new Triangle("Triangle" , 2, 2, 2);
	Parallelogram[] myParallelogram = new Parallelogram[2];
	myParallelogram[0] = new Parallelogram("Parallelogram",20, 40, 27 );
	myParallelogram[1] = new Parallelogram("Parallelogram",30, 10, 85 );
	
	for(int i =0 ; i < myCircle.length; i++)
	{
		DisplayCircle(myCircle[i]);
		DisplayRect(myRect[i]);
		DisplaySquare(mySquare[i]);
		DisplayTriangle(myTriangle[i]);
		DisplayParallelogram(myParallelogram[i]);
		
	}
	
	
}
	
}