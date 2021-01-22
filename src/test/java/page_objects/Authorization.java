package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//СПИСОК ПРОЕКТОВ ДЛЯ АВТОРИЗАЦИИ
//ВАРИАНТЫ АВТОРИЗАЦИИ
//!!!! ЗДЕСЬ НЕТ СПИСКА ФИКСИРОВАННЫХ ЛОГИНОВ И ПАРОЛЕЙ!!!!

public class Authorization {
    public WebDriver driver;
    String saperLoginLocator = "//input[@type='text']";
    String saperPasswordLocator = "//input[@type='password']";
    String saperEnterLocator = "//div[text()='Вход']";
    String saperCheckboxLocator = "//*[@id='root']/div[1]/div/div[4]/div/div[1]";
    String drLoginLocator = "//input[@type='text']";
    String drPasswordLocator = "//input[@type='password']";
    String drEnterLocator = "//div[text()='Вход']";
    String drCheckboxLocator = "//*[@id='root']/div[1]/div/div[4]/div/div[1]";

    public Authorization(WebDriver driver){
        this.driver = driver;
    }

    public void saper(String login, String password) {//АВТОРИЗАЦИЯ В САПЭР БЕЗ "ЗАПОМНИТЬ МЕНЯ"
        driver.findElement(By.xpath(saperLoginLocator)).sendKeys(login);
        driver.findElement(By.xpath(saperPasswordLocator)).sendKeys(password);
        driver.findElement(By.xpath(saperEnterLocator)).click();
    }

    public void demandResponse(String login, String password) {////АВТОРИЗАЦИЯ В DR БЕЗ "ЗАПОМНИТЬ МЕНЯ"
        driver.findElement(By.xpath(drLoginLocator)).sendKeys(login);
        driver.findElement(By.xpath(drPasswordLocator)).sendKeys(password);
        driver.findElement(By.xpath(drEnterLocator)).click();
    }




}
