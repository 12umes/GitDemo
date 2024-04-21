package Test1pkg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

	@AfterSuite
	public void Asuite() {
		{
		System.out.println("I am the no 1 from last");
		}
	}
		@Test
		public void Loans() {
			{
			System.out.println("I am the no 1 from last");
			}
		}
			@Test
			public void CarLoans() {
				{
				System.out.println("I am the no 2 from last");
				}




}
}