package Testclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.addnew;
import projects.base;
public class addnewTest extends base{
	public String sheetname="sheetname";
  @Test
  public void VerifyUserCanaddproduct() throws InterruptedException, IOException {
	  addnew an = PageFactory.initElements(driver,addnew.class);
		 utility util = new utility();
		  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
			  (this.getData(this.getProperty(this.sheetname), 1, 1)));
		  an.Clickdot();
		  an.clickcatalog();
		  an.clickproduct();
		  an.clickadd();
		  an.clickproductinfo();
		  an.enterpname("Mouthorgan");
		  an.entershort("It gives excellent music");
		  an.enterfull("It is easy to carry  and also available in low rate");
		  an.entersku("boo");
		  an.entercid("Apparel >> Accessories");
		  an.enterpub("published only");
		  an.entergt("45");
		  an.enterno("32");
		  an.clickhp();
		  an.enterptid();
		  an.entertemp();
		  an.checkvisible();
		  an.entervid("2");
		  an.enterother();
		  an.entersdate();
		  an.enteredate();
		  an.clickmnew();
		//  an.entercomment("good product");
		  an.clicksave(); 
		  
		  
		  
		  
		 
	  
  }
}
