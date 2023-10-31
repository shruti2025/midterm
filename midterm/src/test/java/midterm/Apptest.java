package midterm;
import org.testng.Assert;
import org.testng.annotations.*;

public class Apptest {

@Test
	public void logintest1()
	{
		App obj = new App();
		Assert.assertEquals( 0 , obj.login("riya","1234"));  
	}

@Test
	public void logintest2()
	{
		App obj1 = new App();
		Assert.assertEquals( 1 , obj1.login("ram","3025"));  
	}
}
