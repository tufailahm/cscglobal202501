public class Welcome
{
	public void printGreetings(String message)
	{
		System.out.println(message);
	}
	public static void main(String[] args)
	{
  		System.out.println("1.MAIN CALLED");
		Welcome w = new Welcome();
		w.printGreetings("RCB won");
		w.printGreetings("Today is monday");
		w.printGreetings("Hello all");
		System.out.println("3. Hello CSC");
	}
}













