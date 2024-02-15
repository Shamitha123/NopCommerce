package Testclass;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import projects.base;
import pageclass.admindashboard;
import Pakdampakdai.utility;

public class loginnTest extends base{
	public String sheetname = "sheetname";
  @Test
  public void verifyAdminIsLoginWithValidCred() throws IOException, InterruptedException {
	  utility util = new utility();
	  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
			  (this.getData(this.getProperty(this.sheetname), 1, 1)));
	  admindashboard adp = PageFactory.initElements(driver, admindashboard.class);
	  boolean actual = adp.getDbTitle().isDisplayed();
	  AssertJUnit.assertTrue(actual);
  }

}

