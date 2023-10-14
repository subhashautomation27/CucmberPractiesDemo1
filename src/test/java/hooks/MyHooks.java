package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	@Before
	public void setUP(Scenario sc)
	{
		System.out.println("-----startexecution-----"+sc.getName());
		System.out.println("-----Browser got launched-----");
		System.out.println("-----Application URL opend-----");
	}
	
	@After
	public void tearDown(Scenario sc)
	{
		
		
		System.out.println("----Application URL closed-----"+sc.getName());
		System.out.println("-----Browser got closed-----");
		System.out.println("----execution end-----");
	}

}
