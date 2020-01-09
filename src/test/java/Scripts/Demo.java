package Scripts;

import org.testng.annotations.Test;
import actions.BaseClass;

public class Demo extends BaseClass {

	@Test
	public void testDemo() {
		System.out.println(driver.getTitle());
	
	}
}