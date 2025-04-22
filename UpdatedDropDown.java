import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		//Clicking the Passenger: Adult plus icon 5 times
		int passengerAdult = 1;
		while (passengerAdult < 5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			passengerAdult++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
}
