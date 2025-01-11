import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class SeleniumDemo {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        findingLogPageElements(driver);
        driver.quit();
        //System.out.println(inputFields);


    }
    private static void findingExeptionsPageElements(WebDriver driver){
        WebElement rowOne= driver.findElement(By.id("row1"));
        WebElement rowOneCss= driver.findElement(By.cssSelector("input[class='input-field']"));
        WebElement editButton= driver.findElement(By.id("edit_btn"));
        WebElement editButtonXpath= driver.findElement(By.xpath("//button[@class='btn']"));
        WebElement addButton= driver.findElement(By.id("add_btn"));
        WebElement addButtonXpath= driver.findElement(By.xpath("//button[@id='add_btn']"));
        List<WebElement> buttons= driver.findElements(By.tagName("button"));
        WebElement linkTextExeptionPageElements= driver.findElement(By.linkText("Selenium WebDriver with Java for beginners program."));
        WebElement partialLinkTextExeptionPageElements=driver.findElement(By.partialLinkText("WebDriver with Java"));
        WebElement addButtonNearEditButton= driver.findElement(RelativeLocator.with(By.tagName("button")).near(By.id("edit_btn")));
    }
    private static void findingLogPageElements(WebDriver driver){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        //Web elements locators will be added here
        WebElement usernameInputField= driver.findElement(By.id("username")); //username ID
        usernameInputField.sendKeys("anyUsername");
        //WebElement userInputFieldXpath= driver.findElement(By.xpath("//input[@id='username']"));
       // WebElement userInputFieldCssSelector= driver.findElement(By.cssSelector("input[id='username']"));
        WebElement passwordInputField= driver.findElement(By.name("password"));
        passwordInputField.sendKeys("anyPassword");
       // WebElement passwordInputFieldXpath= driver.findElement(By.xpath("//input[@name='password']"));
       // WebElement passwordInputFieldCss= driver.findElement(By.cssSelector("input[name='password']"));
        WebElement submitButton= driver.findElement(By.className("btn"));
        submitButton.isDisplayed();
        submitButton.click();
       /* WebElement submitButtonXpath=driver.findElement(By.xpath("//button[@id='submit']"));
        WebElement submitButtonCss= driver.findElement(By.cssSelector("button[id='submit']"));
        List<WebElement> inputFields= driver.findElements(By.tagName("input"));
        WebElement linkTextLocator=driver.findElement(By.linkText("Practice Test Automation."));
        WebElement partialLinkTextLocator= driver.findElement(By.partialLinkText("Test Automation"));
        WebElement passwordFieldBelowUsername=driver.findElement(RelativeLocator.with(By.tagName("input")).below((By.id("username"))));
        WebElement privacyPolicyLink= driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.partialLinkText("Test Automation")));
        */WebElement homeButton=driver.findElement(By.className("menu-item-home"));

    }

    private static String chromeTest(String url){
        WebDriver driver =new ChromeDriver();
        driver.get(url);
        String title= driver.getTitle();
        driver.quit();
        return title;
    }
    private static String firefoxTest(String url){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        WebDriver driver =new FirefoxDriver();
        driver.get(url);
        String title= driver.getTitle();
        driver.quit();
        return title;
    }
}
