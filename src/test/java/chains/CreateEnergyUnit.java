package chains;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page_objects.TestBase;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;

public class CreateEnergyUnit extends WorkPowerTestsChain {
    /*   @BeforeEach//АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЕМ ДЕПАРТАМЕНТА РДУ
       public void createEnergyUnitPreconditions () {
           chrome();
           initPatterns();
           url.saperDev();
           authorization.saper(user_dep_rdu[0], user_dep_rdu[1]);
           act.find(mainPage);
       }

       @AfterEach //ОБЩЕЕ ОКОНЧАНИЕ КАЖДОГО ТЕСТА
       public void createEnergyUnitEnd() {
           driver.quit();
       }
   */
    @Test
    public void createEnergyUnitTest01() {
        act.click(nsi);
        act.moveCursor(energyTab);
        act.click(energyMenu_1);
        act.click(create);
        act.click(xpath("//div[1]/div/input"));
        int numName = 1;
        while (act.findAssertBadMethod(xpath("//td[2][text()='Московский-" + numName + "']"))) {
            numName++;}
        act.textInput(xpath("//div[1]/div/input"),"Московский-" + numName);
        act.click(xpath("//div[2]/div/input"));
        int numId = 100;
        while (act.findAssertBadMethod(xpath("//td[3][text()='" + numId + "']"))) {
            numId++;}
        act.textInput(xpath("//div[2]/div/input"), Integer.toString(numId));
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]"));
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[1]/div/div[2]/div[1]/div[3]/div[1]"));
        act.click(xpath("//div[4]/div/div/input"));
        int numTES = 1;
        while (act.findAssertBadMethod(xpath("//td[5][text()='" + numTES + "']"))) {
            numTES++;}
        act.textInput(xpath("//div[4]/div/div/input"), Integer.toString(numTES));
        act.click(xpath("//div[5]/div/div/input"));
        int numGES = 1;
        while (act.findAssertBadMethod(xpath("//td[6][text()='" + numGES + "']"))) {
            numGES++;}
        act.textInput(xpath("//div[5]/div/div/input"),Integer.toString(numGES));
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]"));
        assertFalse(act.findAssert(xpath("//p[text()='Ошибка!']")));
    }

    @Test
    public void createEnergyUnitTest02() throws InterruptedException {
        act.click(nsi);
        act.moveCursor(energyTab);
        act.click(energyMenu_1);
        List<WebElement> listOfEnergyСhoice = driver.findElements(By.xpath("//div/div[2]/table/tbody/tr"));
        int endList = listOfEnergyСhoice.size();
        act.click(xpath("//div/div[2]/table/tbody/tr[" + endList + "]/td[8]/div/div[1]"));
        if (act.findAssertFalse(xpath("//table/tbody/tr[1]/td[text()='Нет данных']"))){
            List<WebElement> listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
            int maxList = listOfUnit.size();
            while (act.findAssertFalse(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div[1]"))) {
                act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div[1]"));
                listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
                maxList = listOfUnit.size();
                sleep(300);
            }
        }
        act.click(xpath("//div[2]/div[2]/table/tbody/tr[1]/td[3]/div/div"));
        sleep(3000);
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div[2]"));
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[1]/div[4]/div"));
        assertTrue(act.findAssert(xpath("//p[text()='Узел сохранен!']")));
    }
}
