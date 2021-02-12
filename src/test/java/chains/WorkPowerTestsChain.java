package chains;

import org.junit.jupiter.api.Test;

import static org.openqa.selenium.By.xpath;

public class WorkPowerTestsChain extends CreateCalendar {

    @Test //Выбор нескольких месяцев
    public void workPowerTestsChainTest01() throws InterruptedException {
        act.click(calculation);
        act.moveCursor(brrm);
        act.click(brrm_1);
        act.click(formCalculation);
        Thread.sleep(1000);
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/div"));
        act.click(changeMonth);
        act.click(clearMonth);
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[2]/div"));
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[8]/div"));
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[9]/div"));
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div[1]/div[11]/div"));
        act.click(voidPlace);
        calculationRun();
        driver.findElement(calculationDoneSuccess);
    }

    @Test
    public void workPowerTestsChainTest02() {
        act.click(calculation);
        act.moveCursor(brrm);
        act.click(brrm_1);
        act.click(formCalculation);
        act.click(xpath("//table/tbody/tr[1]/td[7]/div[1]/div/a[text()='Перейти']"));
        act.click(xpath("//div[text()='Опубликовать расчет']"));
        act.find(xpath("//p[text()='Расчет опубликован']"));

    }


}
