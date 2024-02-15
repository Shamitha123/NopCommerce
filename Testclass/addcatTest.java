package Testclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.Addcategories;
import pageclass.addnew;
import projects.base;

public class addcatTest extends base {
	public String sheetname="sheetname";
  @Test
  public void newcategories() throws InterruptedException, IOException {
	  utility util=new utility();
	  util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
				(this.getData(this.getProperty(this.sheetname), 1, 1)));
	  addnew an = PageFactory.initElements(driver,addnew.class);
		an.Clickdot();
		an.clickcatalog();
		Addcategories add=PageFactory.initElements(driver,Addcategories.class );
		add.clickcatag();
	    add.clickcatplus();
	    add.catname("musical instruments");
	    add.description("all instruments areavailable");
	    add.pcat("1");
	    add.upload("C:\\Users\\ELCOT\\Documents\\download.png");
	    
	  
		
	  
		
}
}