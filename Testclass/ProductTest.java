package Testclass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import Pakdampakdai.utility;
import pageclass.productsearch;
import projects.base;

public class ProductTest extends base {

	public String sheetname="sheetname";

	@Test
	public void VerifyUserIsAbletoAddProduct() throws InterruptedException, IOException {
		productsearch ps= PageFactory.initElements(driver, productsearch.class);
		utility util = new utility();
		util.adminLogin((this.getData(this.getProperty(this.sheetname), 1, 0)), 
				(this.getData(this.getProperty(this.sheetname), 1, 1)));
		ps.Clickdot();
		ps.clickcatalog();
		ps.clickproduct();
		ps.clicksearch();
		ps.enterproname("apple camera");
		ps.selectCategory(7);
		ps.clickcheckBox();
		ps.selectManufacturer("Apple");
		ps.selectVendor("Vendor 1");
		ps.selectWarehouse(1);
		ps.selectProducttype("simple");
		ps.selectPublished("published only");
		ps.entersku("APPLE_CAM");
		ps.clicksearchh();


	}
}