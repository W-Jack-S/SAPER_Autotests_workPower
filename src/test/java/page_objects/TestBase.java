package page_objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page_objects.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;


public class TestBase extends WebDriverInit {
    public Authorization authorization;
    public PageActions act;
    public HomePage url;

    //СПИСОК ОБЩИХ ЗНАЧЕНИЙ (!!!!ПОЗЖЕ ВЫНЕСТИ ОТДЕЛЬНО!!!!)

    public By mainPage = xpath("//div[text()='Главная страница']");
    public By calculation = xpath("//div[text()='Расчеты']");
    public By nsi = xpath("//div[text()='НСИ']");
    public By calendarTab = xpath("//div[text()='Календарь']");
    public By calendarMenu = xpath("//a[text()='Календарь']");
    public By calendarCreate = xpath("//div[text()='Создать новый календарь']");
    public By create = xpath("//div[text()='Создать']");
    public By BRRM = xpath("//div[text()='Блок расчетов рабочей мощности']");
    public By BRRM_1 = xpath("//a[text()='Расчет рабочей мощности по агрегатам электростанции']");
    public By formCalculation = xpath("//div[text()='Формирование расчета']");
    public By startCalculation = xpath("//span[text()=' Запустить расчет ']");
    public By changeMonth = xpath("//div[text()='Месяцы']");
    public By clearMonth = xpath("//div[text()='Сброс выбора']");
    public By errorIconObjects = xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[4]");
    public By errorIconMonth = xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[1]");
    public By changeCalculationMethod = xpath("//div[text()='Вариант рабочей мощности']");
    public By voidPlace = xpath("//*[@id='root']");
    public By calculationDoneSuccess = xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']");

    public String[] user_dep_rdu = {"test_1","test_1"};

    //ИНИЦИАЛИЗАЦИЯ ПАТТЕРНОВ
    public void initPatterns(){
        url = new HomePage(driver);
        act = new PageActions(driver);
        authorization = new Authorization(driver);
    }

    //ЗАПУСК И ВАЛИДАЦИЯ УСПЕШНОСТИ РАСЧЕТА
    public void calculationRun() {
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        act.click(startCalculation);
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
    }


}
