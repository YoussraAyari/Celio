package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class HomePage { 
@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li/a")
List<WebElement> menus ; 
@FindBy(xpath="/html/body/main/div/header/div[2]/div/div/div/div[1]/div/div[1]/nav/ul/li[2]/ul/li/div/div/div[1]/ul/li/a")
List<WebElement> submenus ; 
@FindBy(xpath="/html/body/main/div/div[2]/div/ul/li[3]")
WebElement Verif ; 

public HomePage () {
	PageFactory.initElements(Config.driver, this);
	
}
public void  MouseHovermenuandClicksubmenu(String menutitle , String submenutitle) {

	WebDriverWait wait = new WebDriverWait(
            Config.driver, Duration.ofSeconds(10)
        );

     String normalizedMenu = menutitle.trim();
     String normalizedSubmenu = submenutitle.trim();

     By menuLocator = By.xpath("//nav//a[normalize-space()=\'" + normalizedMenu + "\']");
     WebElement menu = wait.until(ExpectedConditions.visibilityOfElementLocated(menuLocator));

      new Actions(Config.driver).moveToElement(menu).perform();

     By submenuLocator = By.xpath("//nav//a[normalize-space()=\'" + normalizedSubmenu + "\']");
     WebElement submenu = wait.until(ExpectedConditions.elementToBeClickable(submenuLocator));
  submenu.click();
  
  
}
     
     

 




						
public void VerifPage (String msg) { 
	Assert.assertTrue(Verif.getText().contains(msg));
    
}
}

