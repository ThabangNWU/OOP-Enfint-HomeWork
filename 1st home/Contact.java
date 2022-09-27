public class Contact
{
	//instance variable
	//The Contact 	
	private ContactDetails [] myContact;
	//start
	private int start;
	//size of contact
	private int maxSize;	
	
	public Contact(){
		start = 0;
		maxSize =100;
		myContact = new ContactDetails[maxSize];
		for(int i =0; i < maxSize; i++)
		{
			myContact[i] = null;
		}
	}
	
	public Contact(int maximumInTake){
		start = 0;
		maxSize =maximumInTake;
		myContact = new ContactDetails[maxSize];
		for(int i =0; i < myContact.length; i++)
		{
			myContact[i] = null;
		}		
	}
	
	public void addNewContact(String name, String number)
	{
		if(start < maxSize)
		{
			myContact[start] = new ContactDetails(name, number);
			start++;
		}
		else
		{
			System.out.println("Is Full");
		}
	}

	public String Search(String name){
		int i;
		for(i =0; i < start;i++)
		{
			if(name.equals(myContact[i].getName()))
			{
				break;
			}
		}
		
		if(i < start)
		{
			return myContact[i].getNumber();
		}
		else{
			return "Unlisted number";
		}
	}
	
	public void printContact()
	{		
		for(int i =0 ; i < start ;i++)
		{			
			System.out.println(myContact[i]);
		}		
	}
}