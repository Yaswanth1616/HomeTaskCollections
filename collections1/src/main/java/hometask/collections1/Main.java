package hometask.collections1;
public class Main {

	public static void main(String[] args)
	{
		List listreference=new List("Yaswanth");
		for(int i=2;i<=10;i++)
		{
			listreference.addElementToList(i, listreference);
		}
		listreference.addElementToList('y', listreference);
		listreference.addElementToList(1.67, listreference);
		listreference.printElementsInList(listreference);
		listreference=listreference.removeElementsFromList(2,listreference);  
		listreference.printElementsInList(listreference);
		listreference.fetchElementsinList(1,listreference);
	}
}
