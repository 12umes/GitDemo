package Test1pkg;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Day2 {

	 

	
	
	@AfterTest
	public void lastexecution()
	{	
System.out.println("I will execute last");
		}
	@BeforeSuite
	public void Bsuite() {
		{
		System.out.println("I am the no 1");
		}
		
	}

@Test(groups= {"smoke"})
	public void Demo1()
	{	
System.out.println("Hi");
		}

@Test(groups= {"smoke"})
public void Demo2(){
{
	System.out.println("Bye");
}
}
@BeforeTest
public void Demo3() {
	{
System.out.println("Tata1");
	}
}
	@Test
	public void Car() {
		{
	System.out.println("Nano");
		}
	}
		@Test
		public void Bus() {
			{
		System.out.println("Uber");
			}
		
		
}
}
