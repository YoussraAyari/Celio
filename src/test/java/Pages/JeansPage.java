package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class JeansPage { 
@FindBy(xpath="/html/body/main/div/section/div[3]/div[1]/div[4]/ol/li/div[2]/h5/a")
List<WebElement> produit ; 
@FindBy(xpath="/html/body/main/div/section/div[2]/div/div[5]/div[2]/div/div/h1")
WebElement VerifArticle ; 

public JeansPage () {
	PageFactory.initElements(Config.driver, this);
}

public void ClickProduit (String nomProduit) {
	try {
		for(WebElement prod:produit) {
			if(prod.getText().contains(nomProduit)) {
				prod.click();
				
			}
			
		}
		
	
}catch (Exception e) {
	// TODO: handle exception
}
}
public void VerifProd (String msg ) {
Assert.assertEquals(VerifArticle.getText(), msg);
}
}

