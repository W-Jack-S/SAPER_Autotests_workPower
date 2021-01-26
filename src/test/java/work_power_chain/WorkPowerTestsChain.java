package work_power_chain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_objects.TestBase;

import static org.openqa.selenium.By.xpath;

public class WorkPowerTestsChain extends CreateCalendar {

    @Test
    void workPowerTestsChainTest00() {
        calendarTestsChainTest01();
    }
    
    @Test
    void workPowerTestsChainTest01() {
        act.click(calculation);
        act.moveCursor(brrm);
        act.click(brrm_1);
        act.click(formCalculation);
        act.click(xpath("//table/tbody/tr[1]/td[7]/div[1]/div/a[text()='Перейти']"));
        act.click(xpath("//div[text()='Опубликовать расчет']"));
        act.find(xpath("//p[text()='Расчет опубликован']"));

    }


}
