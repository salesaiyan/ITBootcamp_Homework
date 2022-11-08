package nedelja6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class Domaci {


    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\SaleSaiyan\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver wd = new ChromeDriver();

        wd.get("https://demoqa.com/text-box");
        wd.manage().window().maximize();

        WebElement inputName = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[2]/input[1]"));
        inputName.sendKeys("Petar Peric");
        Thread.sleep(1000);

        WebElement inputEmail = wd.findElement(By.id("userEmail"));
        inputEmail.sendKeys("petarperic@gmail.com");
        Thread.sleep(1000);

        WebElement currentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/textarea[1]"));
        currentAddress.sendKeys("Nemanjina 10");
        Thread.sleep(1000);

        WebElement permanentAddress = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[4]/div[2]/textarea[1]"));
        permanentAddress.sendKeys("Beograd");
        Thread.sleep(1000);

        WebElement click = wd.findElement(By.id("submit"));
        click.click();
        Thread.sleep(1000);

        List<WebElement> listaParagrafa = wd.findElements(By.tagName("p"));
        System.out.println("Paragrafi:");
        for (WebElement webElement : listaParagrafa) {
            System.out.println(webElement.getText());
        }

        WebElement msg = wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]"));
        System.out.println(wd.findElement(By.id("name")).getText().contains("Petar Peric"));
        System.out.println(wd.findElement(By.id("email")).getText().contains("petarperic@gmail.com"));
        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]")).getText().contains("Nemanjina 10"));
        System.out.println(wd.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[1]")).getText().contains("Beograd"));

        wd.close();

    }
}
