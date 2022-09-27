import java.util.Enumeration;
import java.lang.reflect.Array;
public  class MyEnumeration implements Enumeration {
	public final Object isEnum;
	public int size;
	public int currentPosition;
	
	public MyEnumeration(Object isEnum){
		size = Array.getLength(obj);
		this.isEnum = isEnum;		
	}
	//there are elements to extract
	public boolean hasMoreElements()
	{
		return currentPosition < size;
	}
	
	//return next elements
	public object nextElements()
	{
		return Array.get(array, currentPosition++);
	}
	
	
}