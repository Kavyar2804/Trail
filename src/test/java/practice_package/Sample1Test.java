package practice_package;

import org.testng.annotations.Test;

public class Sample1Test {


	@Test(groups = {"smoke","regression"})
	public void script1()
	{
		System.out.println("script1");
	}
	
	@Test(groups = "regrssion")
	public void script2()
	{
		System.out.println("script2");
	}

}
