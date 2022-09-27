public class ContactDetails{
	
	private String name;
	private String number;
	
	
	public ContactDetails(){
		this("","");
	}
	public ContactDetails(String name, String number ){
		setName(name);
		setNumber(number);		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
	
	public String toString()
	{
		return number +" - "+ name;
	}	
		
}