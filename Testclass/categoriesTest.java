package Testclass;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pakdampakdai.utility;
import pageclass.addnew;
import projects.base;

public class categoriesTest extends base{
	public String sheetname="sheetname";
	@Test
	public void VerifyUserCanSearchProductBycategories() throws InterruptedException, IOException {
		pageclass.categories ca = PageFactory.initElements(driver, pageclass.categories.class);
		utility util = new utility();
		util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
				(this.getData(this.getProperty(this.sheetname), 1, 1)));
		addnew an = PageFactory.initElements(driver,addnew.class);
		an.Clickdot();
		an.clickcatalog();
		ca.clickcategories();
		ca.entercatname("computers");
		ca.publish("1");
		ca.search();
		String title = driver.getTitle();
		System.out.println(title);
         
		

	}	
}
