package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utile;
import Pages.JeansPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JeansStepDef { 
	@Given("utilisateur est sur la page jeans")
	public void utilisateur_est_sur_la_page_jeans() throws Exception {
		Config.driver = new ChromeDriver (); 
		Config.maximizeWindow();
		Config.driver.get(Utile.getProperty("UrlJeans"));
	   
	}
	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String nomProduit) {
		JeansPage page = new JeansPage (); 
		page.ClickProduit(nomProduit);
	    
	}
	@Then("la page produit est affiché {string}")
	public void la_page_produit_est_affiché(String string) {
		JeansPage page = new JeansPage (); 
		page.VerifProd(string);
	    
	}

}
