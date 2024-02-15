package Testclass;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.addnew;
import pageclass.productReview;
import projects.base;

public class productReviewTest extends base{
	public String sheetname="sheetname";
  @Test
  public void VerifyUserIsAbletoAddProducrReview() throws InterruptedException, IOException {
	  addnew an = PageFactory.initElements(driver,addnew.class);
		 utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
			  (this.getData(this.getProperty(this.sheetname), 1, 1)));
		  an.Clickdot();
		  an.clickcatalog();
		  productReview rev = PageFactory.initElements(driver,productReview .class);
		  rev.clickrev();
		  rev.clicksearch();
		  rev.selectdate();
		  rev.date2();
		  rev.entermess("good Qualityproduct");
		  rev.approve();
		  rev.enterproduct("music instrument");
		  rev.search();
		  rev.checkbox();
		  rev.giveapprove();
  }
}
