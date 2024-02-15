package Testclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.addnew;
import pageclass.admindashboard;
import projects.base;

public class DashboardTest extends base{
	public String sheetname="sheetname";
  @Test
  public void dboard() throws InterruptedException, IOException {
	  utility util = new utility();
	  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
			  (this.getData(this.getProperty(this.sheetname), 1, 1)));
	  addnew an = PageFactory.initElements(driver,addnew.class);
	  an.Clickdot();
	  admindashboard ad= PageFactory.initElements(driver, admindashboard.class);
	  ad.getDbTitle();
	  ad.clicklogoutbtn();
  }
}
