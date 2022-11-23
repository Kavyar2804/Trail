package practice_package;

import org.testng.annotations.Test;

public class PasstheParameterTest {
	
	@Test
	public void data()
	{
		String Browser = System.getProperty("browser");
		String UN = System.getProperty("usn");
		System.out.println(Browser);
		System.out.println(UN);
	}
	

}
