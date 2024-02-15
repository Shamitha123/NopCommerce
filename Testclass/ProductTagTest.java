package Testclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.addnew;
import pageclass.productTag;
import projects.base;

public class ProductTagTest extends base{
	public String sheetname="sheetname";
  @Test
  public void VerifyUserCanSearchAndDelteUsingProductTag() throws InterruptedException, IOException {
	  addnew an = PageFactory.initElements(driver,addnew.class);
		 utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
			  (this.getData(this.getProperty(this.sheetname), 1, 1)));
		  an.Clickdot();
		  an.clickcatalog();
		  productTag pt = PageFactory.initElements(driver,productTag.class);
		  pt.clickProductTag();
		  pt.clicksearch();
		  pt.enterTag("computer");
		  pt.clicksearch2();
		  pt.delete();
		  
  }
}
