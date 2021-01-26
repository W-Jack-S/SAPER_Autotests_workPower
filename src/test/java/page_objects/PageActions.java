package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageActions {
    public WebDriver driver;

    //БАЗОВЫЕ ОПЕРАЦИИ С ИНТЕРФЕЙСОМ ВЕБ СТРАНИЦЫ

    public PageActions(WebDriver driver) {
        this.driver = driver;
    }

    //КЛИК ЛЕВОЙ КОНОПКОЙ МЫШЫ
    public void click(By elementBy) {
        driver.findElement(elementBy).click();
    }

    //НАВЕДЕНИЕ КУРСОРА МЫШЫ НА ОБЪЕКТ
    public void moveCursor(By elementBy) {
        Actions moving = new Actions(driver);
        moving.moveToElement(driver.findElement(elementBy)).build().perform();
    }

    //ПРОСТО ПОИСК ПО ЛОКАТОРУ
    public void find(By elementBy) {
        driver.findElement(elementBy);
    }

    //ПОИСК И ПРОВЕРКА НАЛИЧИЯ ЭЛЕМЕНТА НА СТРАНИЦЕ !!! НЕ ОТРАБАТЫВАЕТ !!! РАЗОБРАТЬСЯ
    public boolean findAssert(By elementBy) {
        try{
        assertTrue(driver.findElement(elementBy).isDisplayed());
        return true;
        }
        catch (Exception e) {return false;}

    }

    //ОЧИСТКА И ЗАПОЛНЕНИЕ ПОЛЯ
    public void textInput(By elementBy, String text) {
        String input = driver.findElement(elementBy).getAttribute("value");
        driver.findElement(elementBy).click();
        if (input != "") {
            driver.findElement(elementBy).clear();
        }
        //!!!!МЕТОД .clear() ОТРАБАТЫВАЕТ НЕ ВСЕГДА - ПРОБЛЕМЫ С ОЧИСТКОЙ ПОЛЕЙ С АВТОЗАПОЛНЕНИЕМ
        //НИЖЕ - АВАРИЙНЫЙ КОСТЫЛЬ: ЗАБИТЬ ПОЛЕ BackSpace'ом
        String inputAfter = driver.findElement(elementBy).getAttribute("value");
        while (inputAfter != "") {
            driver.findElement(elementBy).sendKeys("\b");
            inputAfter = driver.findElement(elementBy).getAttribute("value");
        }
        driver.findElement(elementBy).sendKeys(text);
    }

    //ПОИСК И ПРОВЕРКА НАЛИЧИЯ ЭЛЕМЕНТА НА СТРАНИЦЕ С ВОЗВРАТОМ РЕЗУЛЬТАТА TRUE/FALSE ! ИНДУССКИЙ МЕТОД ! ПОЗЖЕ ПОДОБРАТЬ ЯВНЫЕ ОЖИДАНИЯ И УБРАТЬ TRY CATCH
    public boolean findAssertBadMethod(By elementBy) {
        try {
            driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            assertTrue(driver.findElement(elementBy).isDisplayed());
            return true;
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return false;
        }
    }

}