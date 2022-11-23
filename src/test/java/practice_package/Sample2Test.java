package practice_package;

import org.testng.annotations.Test;

public class Sample2Test {
	@Test(groups = "regression")
	public void script3()
	{
		System.out.println("script3");
	}
	
	@Test(groups = "smoke")
	public void script4()
	{
		System.out.println("script4");
	}

}
