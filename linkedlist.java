import java.util.*;
class linkedlist
{
    public static void main(String []args)
    {
	LinkedList<String>List = new LinkedList<String>();
	List.add("abc");
	List.add("pqr");	
	List.add("xyz");
	Iterator i = List.iterator();
	while(i.hasNext())
	{
	   System.out.println(i.next());
	}
    }
}	
