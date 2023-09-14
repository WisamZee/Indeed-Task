package DataSource;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.Driver;

public class IndeedPage {
	public IndeedPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id =  "text-input-what")
	public WebElement whatField;
	
	@FindBy (id =  "text-input-where")
	public WebElement whereField;
	
	@FindBy (css =   ".yosegi-InlineWhatWhere-primaryButton")
	public WebElement HomeSearchTextBox;

	@FindBy (linkText =    "Post your resume")
	public WebElement HomePagePostResumelinke;

}
