package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pageObjects.AuthentificationPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDef {
	
	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AuthentificationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);
	}
	
	@Given("^Je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.openURLWithConfigFile("url1");
	}

	@When("^Je saisie le nom d'utilisateur$")
	public void jeSaisieLeNomDUtilisateur() throws Throwable {
		authentificationPage.fillUsername();
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authentificationPage.fillPassword();
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authentificationPage.clickLoginButton();
	}

	@Then("^Je me redirige vers la page Home$")
	public void jeMeRedirigeVersLaPageHome() throws Throwable {
	    
	}

}
