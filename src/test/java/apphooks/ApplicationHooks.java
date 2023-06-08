package apphooks;

import java.io.IOException;

import com.Utility.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks extends utility {
	
	@Before()
	public void launchBrowser() throws IOException {
		

		utility.launchingBrowser();
		
		utility.launchingApp();
		
		driver.manage().window().maximize();
		
		
		
		
	}

	@After()
	public void quitBrowser() {
		
		utility.closingBrowser();
		report.flush();
		
	}

}
