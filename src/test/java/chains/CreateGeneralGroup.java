package chains;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page_objects.Authorization;
import page_objects.TestBase;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;

public class CreateGeneralGroup extends CreateEnergyUnit {

    /*@BeforeEach//АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЕМ ДЕПАРТАМЕНТА РДУ
    public void createGeneralGroupPreconditions () {
        chrome();
        initPatterns();
        url.saperDev();
        authorization.saper(user_dep_rdu[0], user_dep_rdu[1]);
        act.find(mainPage);
    }

    @AfterEach //ОБЩЕЕ ОКОНЧАНИЕ КАЖДОГО ТЕСТА
    public void createGeneralGroupEnd() {
        driver.quit();
    }*/

    @Test
    public void createGeneralGroupTest01() {
        act.click(nsi);
        act.moveCursor(energyTab);
        act.click(energyMenu_1);
        act.click(xpath("//div[text()='Описание ГГ']"));
        act.click(create);
        act.click(xpath("//div[1]/div/input"));
        int numName = 1;
        while (act.findAssertBadMethod(xpath("//td[2][text()='Московская-" + numName + "']"))) {
            numName++;}
        act.textInput(xpath("//div[1]/div/input"),"Московская-" + numName);
        act.click(xpath("//div[2]/div/div[2]/div/div[1]/div/div[2]/div/div[1]"));
        List<WebElement> listOfTypeStation = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div"));
        int endListComboBox1 = listOfTypeStation.size();
        act.click(xpath("//div[2]/div/div[2]/div/div[1]/div/div[2]/div/div[3]/div[" + endListComboBox1 + "]"));
        act.click(xpath("//div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[1]"));
        List<WebElement> listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[3]/div"));
        int endListComboBox2 = listOfUnit.size();
        act.click(xpath("//div[2]/div/div[2]/div/div[1]/div/div[3]/div/div[3]/div[" + endListComboBox2 + "]"));
        act.click(xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]"));
        assertFalse(act.findAssert(xpath("//p[text()='Ошибка!']")));
    }


    @Test
    public void createGeneralGroupTest02() throws InterruptedException {
        act.click(nsi);
        act.moveCursor(energyTab);
        act.click(energyMenu_1);
        act.click(xpath("//div[text()='Описание ГГ']"));
        List<WebElement> listOfEnergyСhoice = driver.findElements(By.xpath("//div/div[2]/table/tbody/tr"));
        int endList = listOfEnergyСhoice.size();
        act.click(xpath("//div/div[2]/table/tbody/tr[" + endList + "]/td[5]/div/div[1]"));
        if (act.findAssertTrue(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div[1]"))){
            List<WebElement> listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
            int maxList = listOfUnit.size();
            while (act.findAssertTrue(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div[1]"))) {
                act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div[1]"));
                listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
                maxList = listOfUnit.size();
                sleep(300);
            }
        }
        act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[2]/div[3]/table/tbody/tr[1]/td[3]/div/div"));
        act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div[2]"));
        if (act.findAssertTrue(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div"))) {
            List<WebElement> listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
            int maxList = listOfUnit.size();
            while (act.findAssertTrue(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div"))) {
                act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[3]/div/div"));
                listOfUnit = driver.findElements(By.xpath("//div[2]/div/div[2]/div/div[3]/div[1]/div[2]/table/tbody/tr"));
                maxList = listOfUnit.size();
                sleep(300);
            }
        }
        act.click(xpath("//div[2]/div/div[2]/div/div[3]/div[2]/div[2]/table/tbody/tr/td[3]/div/div"));
        act.click(xpath("//div[2]/div/div[2]/div/div[1]/div[3]/div"));
        assertTrue(act.findAssert(xpath("//p[text()='Запись сохранена!']")));
    }
}
