package DataSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Driver;

public class IndeedSigninPage {
public IndeedSigninPage() {
	PageFactory.initElements(Driver.getDriver(),this);
	
}
@FindBy ( linkText = "Sign in" ) 
public WebElement signinBtnElement;

@FindBy(xpath = "//h1[text()='Ready to take the next step?']")
public WebElement signInPage_ReadyForNextStep_TextElement;

@FindBy(name = "__email")
public WebElement signInPage_emalField;

@FindBy(xpath = "//button{@data-tn-element='auth-page-email-submit-button']")
public WebElement signInPage_ContinueBtn;

@FindBy(xpath = "//h1[text()='Create your account']")
public WebElement signInPage_CreateAccount_Text;

@FindBy(linkText = "Sign up with a password instead")
	public WebElement signInPage_signin_with_Passwo;

}
