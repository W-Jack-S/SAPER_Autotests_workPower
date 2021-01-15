import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBase {
    String SAPER_url = "http://saper-test.ic.ntcees.ru/";
    public WebDriver driver;
    public WebDriverWait wait;

    String calculation = "//div[text()='Расчеты']";
    String BRRM = "//div[text()='Блок расчетов рабочей мощности']";
    String BRRM_1 = "//a[text()='Расчет рабочей мощности по агрегатам электростанции']";
    String formCalculation = "//div[text()='Формирование расчета']";
    String startCalculation = "//span[text()=' Запустить расчет ']";
    String changeMonth = "//div[text()='Месяцы']";
    String clearMonth = "//div[text()='Сброс выбора']";
    String errorIconObjects = "//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[4]";
    String errorIconMonth = "//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[1]";
    String changeCalculationMethod = "//div[text()='Вариант рабочей мощности']";


    public void waitVisibility (By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy) {
        driver.findElement(elementBy).click();
    }


    public void isElementDisplayed (By elementBy) {

        assertTrue(driver.findElement(elementBy).isDisplayed());
    }

    public void moveCursor (By elementBy) {
        WebElement hover = driver.findElement(elementBy);
        Actions moving = new Actions(driver);
        moving.moveToElement(hover).build().perform();
    }

    public void authorization (String login, String password){
        WebElement log = driver.findElement(By.xpath("//input[@type='text']"));
        log.sendKeys(login);
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Вход']")).click();

    }


    @BeforeEach
    public void Start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(SAPER_url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @AfterEach
    public void end(){
       driver.quit();
    }


}
