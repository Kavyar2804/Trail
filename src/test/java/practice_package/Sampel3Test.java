package practice_package;

import org.testng.annotations.Test;

public class Sampel3Test {
	
	@Test(groups = "regression")
	public void script5()
	{
		System.out.println("script5");
	}
	
	@Test(groups = "smoke")
	public void script6()
	{
		System.out.println("script6");
	}

}
