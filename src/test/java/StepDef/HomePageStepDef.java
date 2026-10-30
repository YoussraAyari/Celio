package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utile;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef { 
	@Given("utilsateur sur la page dacuil")
	public void utilsateur_sur_la_page_dacuil() throws Exception {
		Config.driver =new ChromeDriver(); 
		Config.maximizeWindow();
		Config.driver.get(Utile.getProperty("HomeCelio"));
		
		
		
		
		
	}
	 
	@When("utilisateur survole sur le menu {string} et clique sur le sous menu {string}")
	public void utilisateur_survole_sur_le_menu_et_clique_sur_le_sous_menu(String menuTitle, String submenuTitle) {
		HomePage page = new HomePage (); 
		page.MouseHovermenuandClicksubmenu(menuTitle, submenuTitle);
		
	}
	    
	@Then("utlisateur est dirigé vers la page de {string}")
	public void utlisateur_est_dirigé_vers_la_page_de(String submenuTitle) {
		HomePage page = new HomePage (); 
		page.VerifPage(submenuTitle);
		Config.driver.quit();
	 
	}


}
