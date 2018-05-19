package week2wed;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class copydropdown {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize(); //maximize window
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://leafground.com/pages/Dropdown.html"); //open URL
WebElement dropdown = driver.findElementByName("dropdown2"); //finds the particular dropdown
Select drop=new Select(dropdown); //creates object for dropdown webelement

//gets all options from the dropdown and stores in list of webelements 'allOptions'
List<WebElement> allOptions = drop.getOptions(); 

//gets the size of the dropdown list
int size = allOptions.size();

//last but one option is size-2 (size-1 is last option)//.click selects it
allOptions.get(size-2).click();

}

}