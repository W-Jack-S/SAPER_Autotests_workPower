package chains;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_objects.TestBase;

import static org.openqa.selenium.By.xpath;

public class CreateCalendar extends TestBase {
    @BeforeEach//АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЕМ ДЕПАРТАМЕНТА РДУ
    public void powerTestsChainPreconditions () {
        chrome();
        initPatterns();
        url.saperDev();
        authorization.saper(user_dep_rdu[0], user_dep_rdu[1]);
        act.find(mainPage);
    }

/*    @AfterEach //ОБЩЕЕ ОКОНЧАНИЕ КАЖДОГО ТЕСТА
    public void powerTestsChainend() {
        driver.quit();
    }
*/
    @Test
    public void calendarTestsChainTest01() {
        act.click(nsi);
        act.moveCursor(calendarTab);
        act.click(calendarMenu);
        act.click(xpath("//div[text()='Год']"));
        int year = 2000;
        while (act.findAssertBadMethod(xpath("//div[@title='Выбрать' and text()='" + year + "']"))) {
            year++;}
        act.click(calendarCreate);
        act.textInput(xpath("//input"),Integer.toString(year));
        act.click(xpath("//div[text()='Создать']"));
        act.find(xpath("//p[2][text()='Календарь создан!']"));
        act.click(xpath("//div[text()='Год']"));
        act.click(xpath("//div[@title='Выбрать' and text()='" + year + "']"));
    }
}
