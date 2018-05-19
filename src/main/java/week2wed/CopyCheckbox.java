package week2wed;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CopyCheckbox {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

//#1 Dropdown selecting exercies
driver.get("http://leafground.com/pages/Dropdown.html");	
Thread.sleep(3000);

Select sel=new Select(driver.findElementById("dropdown3"));
List<WebElement> count= sel.getOptions();
int size=count.size();
System.out.println("Options present in Dropdown : "+size);	
sel.selectByIndex(size-1);

// #2 Check-box Selecting Exercies
Thread.sleep(3000);
driver.get("http://leafground.com/pages/checkbox.html");
driver.findElementByXPath("(//input[@type='checkbox'])[1]").click();

if(driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected())
{
System.out.println("Check box is Selected");
}
else
driver.findElementByXPath("(//input[@type='checkbox'])[6]").click();

driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();

List<WebElement> selectall=driver.findElementsByXPath("//div[@class='example'][4]/input");

for(WebElement el : selectall)
{
if(!el.isSelected())
el.click();
}
}

}
