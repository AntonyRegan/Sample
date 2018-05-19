package week2wed;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Xpath4 = driver.findElementByXPath("(//select[@class='dropdown'])");
		Select obj=new Select(Xpath4);
		List<WebElement> alloptions = obj.getOptions();
		int size = alloptions.size();
		obj.selectByIndex(size-1);
		
		WebElement Xpath6=driver.findElementByXPath("(//div[@class='example'][6]/select)");//In this code,I'm using ( //div[@class='example'][6]/select) this X path to select specific class and using index to select div and option in drop-down
		Select obj1=new Select(Xpath6);
		obj1.selectByIndex(1);
		
		
		

	}

}
