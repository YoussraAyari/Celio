package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjouterpanierPage {  
	
	@FindBy(id="product-addtocart-button")
	WebElement boutonajouter;
	
	@FindBy(xpath="/html/body/div[2]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/div/button")
	WebElement boutoncommander;
	
	@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/div/strong/a")
	WebElement verifPanier;
	
	public  AjouterpanierPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ajoutPanier() {
		boutonajouter.click();
		Config.wait(10);
		
		boutoncommander.click();
		
		
		
		
	}
	public void verif(String msg) {
		Assert.assertTrue(verifPanier.getText().contains(msg));
	}
	
	

}
