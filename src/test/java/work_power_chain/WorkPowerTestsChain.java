package work_power_chain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_objects.TestBase;

import static org.openqa.selenium.By.xpath;

public class WorkPowerTestsChain extends TestBase {

    @BeforeEach//АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЕМ ДЕПАРТАМЕНТА РДУ
    public void workPowerTestsChainPreconditions() {
        chrome();
        initPatterns();
        url.saperTest();
        authorization.saper(user_dep_rdu[0], user_dep_rdu[1]);
        act.find(mainPage);
    }

    @AfterEach //ОБЩЕЕ ОКОНЧАНИЕ КАЖДОГО ТЕСТА
    public void end() {
        driver.quit();
    }

    @Test
    void workPowerTestsChainTest01() {
        act.click(nsi);
        act.moveCursor(calendarTab);
        act.click(calendarMenu);
        act.click(xpath("//div[text()='Год']"));
        int year = 2000;
        while (act.findAssertBadMethod(xpath("//div[@title='Выбрать' and text()='" + year + "']"))) {
            year++;}
        act.click(calendarCreate);
        act.textInput(xpath("//input"),Integer.toString(++year));
        act.click(create);
        act.find(xpath("//p[2][text()='Календарь создан!']"));
        act.click(xpath("//div[text()='Год']"));
        act.click(xpath("//div[@title='Выбрать' and text()='" + year + "']"));
    }

    @Test
    void workPowerTestsChainTest02() {
        act.click(calculation);
        act.moveCursor(BRRM);
        act.click(BRRM_1);
        act.click(formCalculation);
        act.click(xpath("//table/tbody/tr[1]/td[7]/div[1]/div/a[text()='Перейти']"));
        act.click(xpath("//div[text()='Опубликовать расчет']"));
        act.find(xpath("//p[text()='Расчет опубликован']"));
    }


}
