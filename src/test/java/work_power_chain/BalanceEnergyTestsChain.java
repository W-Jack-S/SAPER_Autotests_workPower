package work_power_chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_objects.TestBase;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;


public class BalanceEnergyTestsChain extends CreateCalendar {

    @Test
    void balanceEnergyTestsChainTest00() {
        calendarTestsChainTest01();
    }

    @Test
    void balanceEnergyTestsChainTest01() throws InterruptedException {
        act.click(calculation);
        act.moveCursor(brgg);
        act.click(brgg_1);
        act.click(inputBalance);
        sleep(5000); //неявные ожидания не отрабатывают
        int numBalance = 1;
        while (act.findAssertBadMethod(xpath("//span[text()='Баланс" + numBalance + "']"))) {
            numBalance++;}
        //if (act.findAssert(xpath("//div[text()='Добавить новый вариант']"))){
          //  act.click(xpath("//div[text()='Добавить новый вариант']"));
            //}else {
            act.click(xpath("//div[text()='Создать новый вариант']"));
        //}
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div/div/input"));
        act.textInput(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div/div/input"),"Баланс"+numBalance);
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div/div[1]/div[2]"));
        act.click(xpath("//div[@title='Выбрать' and text()='2021']"));
        act.click(xpath("//div[text()='Создать Вариант']"));
        act.click(create);
        act.find(xpath("//span[text()='Баланс" + numBalance + "']"));
        }

     /*   @Test
    void balanceEnergyTestsChainTest02() throws InterruptedException {
            act.click(calculation);
            act.moveCursor(brgg);
            act.click(brgg_1);
            act.click(inputBalance);
            sleep(5000); //неявные ожидания не отрабатывают
            int numBalance = 1;
            while (act.findAssertBadMethod(xpath("//span[text()='Баланс" + numBalance + "']")) == false) {
                numBalance++;}
            System.out.println(numBalance);
            act.click(xpath("//span[text()='Баланс" + numBalance + "']"));
            sleep(5000); //неявные ожидания не отрабатывают
            act.find(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/section/div/div/input"));
            //act.click(xpath("//input[@accept='.xls, .xlsx']"));
            act.textInput(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/section/div/div/input"),System.getProperty("user.dir") + "/Прогнозный баланс электроэнергии СО на 2021.xlsx");
            //act.textInput(xpath("//input[@accept='.xls, .xlsx']"),System.getProperty("user.dir") + "/Прогнозный баланс электроэнергии СО на 2021.xlsx");
            //act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/section/div/div/p"));
        } */

    }

