package hometask.collections1;
public class List<T> {
	T value;
	List listreference=null;
    List(T value)
	{
		this.value=value;
	}
    void printElementsInList(List listreference)
    {
    	if(listreference!=null)
    	{
    		System.out.print(listreference.value+" ");
    		listreference.printElementsInList(listreference.listreference);
    	}
    	else
    	{
    		System.out.println();
    	}
    }
    List removeElementsFromList(int x,List listreference)
    {
    	
    	List listreference1=listreference;
    	if(x==1)
    	{
    		System.out.println(listreference.value+" element removed");
    		return listreference.listreference;
    	}
    	if(x<1)
    	{
    		System.out.println("invalid index");
    		return listreference;
    	}
    	x=x-2;
    	while(x>0)
    	{
    		if(listreference!=null)
    		{
    			listreference=listreference.listreference;
    		}
    		else
    		{
    			break;
    		}
    		x--;
    	}
    	if(listreference!=null)
    	{
    		System.out.println(listreference.listreference.value+" element removed");
    		listreference.listreference=listreference.listreference.listreference;
    	}
    	else
    	{
    		System.out.println("index does not exist");
    	}
    	return listreference1;
    }
	void addElementToList(T ele,List listreference)
    {
    	if(listreference.listreference==null)
    	{
    		listreference.listreference=new List(ele);
    	}
    	else
    	{
    		listreference.addElementToList(ele, listreference.listreference);
    	}
    }
	void fetchElementsinList(int x,List listreference)
	{
		int y=x;
		x=x-1;
		while(x!=0)
		{
			if(listreference.listreference!=null)
			{
			listreference=listreference.listreference;
			}
			else
			{
				System.out.println("index does not exist");
				return ;
			}
			x--;
		}
		
		System.out.println("The element at index "+y+" is "+listreference.value);
	}
}
