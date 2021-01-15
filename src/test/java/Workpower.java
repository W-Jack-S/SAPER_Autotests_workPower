import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;

//Тест-кейсы Рабочая мощность

public class Workpower extends TestBase {
    @Test //Выбор всех объектов
    public void Test1() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор нескольких станций
    public void Test2() throws InterruptedException {
        authorization("test_1", "test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор станции с агрегатами
    public void Test3() throws InterruptedException {
        authorization("test_1", "test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор станции без оборудования
    public void Test4() throws InterruptedException {
        authorization("test_1", "test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор одной ОЭС
    public void Test5() throws InterruptedException {
        authorization("test_1", "test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[2]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор одной Энергосистемы
    public void Test6() throws InterruptedException {
        authorization("test_1", "test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор одного месяца
    public void Test7() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath(changeMonth));
        click(xpath(clearMonth));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[7]/div"));
        click(xpath("//*[@id='root']"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Выбор нескольких месяцев
    public void Test8() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath(changeMonth));
        click(xpath(clearMonth));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[8]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[9]/div"));
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[11]/div"));
        click(xpath("//*[@id='root']"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Не выбирать объект
    public void Test9() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 0);
        moveCursor(xpath(errorIconObjects));
        driver.findElement(By.xpath("//div[text()='Необходимо выбрать хотя бы 1 объект']"));
    }

    @Test //Выбор другого варианта рабочей мощности
    public void Test10() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(changeCalculationMethod));
        click(xpath("//div[text()='Вариант 1']"));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 1);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]/div[@title='Расчет завершен']"));
    }

    @Test //Не выбирать объект
    public void Test11() throws InterruptedException {
        authorization ("test_1","test_1");
        Thread.sleep(1000);
        click(xpath(calculation));
        moveCursor(xpath(BRRM));
        click(xpath(BRRM_1));
        click(xpath(formCalculation));
        Thread.sleep(1000);
        click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        click(xpath(changeMonth));
        click(xpath(clearMonth));
        click(xpath("//*[@id='root']"));
        List<WebElement> listOfCalculation = driver.findElements(By.xpath("//table/tbody/tr"));
        int beforeResult = listOfCalculation.size();
        click(xpath(startCalculation));
        List<WebElement> listOfCalculationResult = driver.findElements(By.xpath("//table/tbody/tr"));
        int afterResult = listOfCalculationResult.size();
        assertTrue((afterResult - beforeResult) == 0);
        moveCursor(xpath(errorIconMonth));
        driver.findElement(By.xpath("//div[text()='Необходимо выбрать хотя бы 1 фактический месяц']"));
    }
}
