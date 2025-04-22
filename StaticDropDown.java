import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Handling dropdown with "Select" tag (static dropdown)
		WebElement currencyDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(currencyDropdown);
		dropDown.selectByIndex(3); //select by index within the dropdown
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("AED"); //select by visible text within the dropdown
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("INR"); //select by html value within the dropdown
		System.out.println(dropDown.getFirstSelectedOption().getText());
	}
}
