package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utile;
import Pages.AjouterpanierPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AjouterpanierStepDef {
	@Given("utilisateur est sur la page produit")
	public void utilisateur_est_sur_la_page_produit() throws Exception {
		Config.driver = new ChromeDriver (); 
		Config.maximizeWindow();
		Config.driver.get(Utile.getProperty("UrlProd"));
	    
	}
	@When("utilisateur clique sur le bouton ajouter au panier")
	public void utilisateur_clique_sur_le_bouton_ajouter_au_panier() {
		AjouterpanierPage page = new AjouterpanierPage(); 
		page.ajoutPanier();
	    
	}

}
