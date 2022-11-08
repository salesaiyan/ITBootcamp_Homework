package nedelja6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Domaci20 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\SaleSaiyan\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://demoqa.com/automation-practice-form");
        wd.manage().window().maximize();
        Actions actions = new Actions(wd);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) wd;

        WebElement firstName = wd.findElement(By.id("firstName"));
        firstName.sendKeys("Michael");
        Thread.sleep(1000);

        WebElement lastName = wd.findElement(By.id("lastName"));
        lastName.sendKeys("Jordan");
        Thread.sleep(1000);

        WebElement userEmail = wd.findElement(By.id("userEmail"));
        userEmail.sendKeys("gmail@gmail.com");
        Thread.sleep(1000);

        WebElement radioButton = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]"));
        radioButton.click();
        Thread.sleep(1000);

        WebElement userNumber = wd.findElement(By.id("userNumber"));
        userNumber.sendKeys("0641234567");
        Thread.sleep(1000);

        WebElement date = wd.findElement(By.id("dateOfBirthInput"));
        date.click();
        actions.click(wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).perform();
        Thread.sleep(1000);


        Select monthSelect = new Select( wd.findElement(By.xpath("//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__month-select']")));
        monthSelect.selectByVisibleText("November");
        Thread.sleep(1000);
        Select yearSelect = new Select( wd.findElement(By.xpath("//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__year-select']")));
        yearSelect.selectByValue("1992");
        Thread.sleep(1000);
        wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]")).click();
        Thread.sleep(1000);

        WebElement subject = wd.findElement(By.id("subjectsInput"));
        subject.sendKeys("Comp");
        subject.sendKeys(Keys.ARROW_DOWN);
        subject.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        wd.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
        Thread.sleep(1000);
        wd.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
        Thread.sleep(1000);

        WebElement chooseFile =  wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[8]/div[2]/div[1]/input[1]"));
        chooseFile.sendKeys("C:\\Users\\SaleSaiyan\\Downloads\\jordan.jpg");
        Thread.sleep(1000);

        WebElement address = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]"));
        address.sendKeys("Serbia");
        Thread.sleep(1000);

        WebElement address2 = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[9]/div[2]/textarea[1]"));
        address2.sendKeys("Finland");
        WebElement country = wd.findElement(By.id("react-select-3-input"));
        country.sendKeys("NCR");
        country.sendKeys(Keys.TAB);
        WebElement city = wd.findElement(By.id("react-select-4-input"));
        city.sendKeys("Delhi");
        city.sendKeys(Keys.TAB);
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("arguments[0].scrollIntoView();", wd.findElement(By.id("submit")));
        wd.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        wd.close();

    }
}
