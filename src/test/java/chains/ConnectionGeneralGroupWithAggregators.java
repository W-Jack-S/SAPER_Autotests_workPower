package chains;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class ConnectionGeneralGroupWithAggregators extends CreateGeneralGroup{
    @Test
    public void startCalculationProduction (){
        act.click(calculation);
        act.moveCursor(brgg);
        act.click(brgg_1);
        act.click(formCalculation);
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[4]/div[1]"));
        List<WebElement> listOfBalance = driver.findElements(By.xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[4]/div[3]/div"));
        int maxList = listOfBalance.size();
        act.click(xpath("//*[@id='root']/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[4]/div[3]/div[" + maxList + "]"));
        act.click(startCalculation);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        act.findAssertTrue(calculationDoneSuccess);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}