package chains;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;

public class CalculationGeneralGroup extends CreateGeneralGroup {
    @Test
    public void startCalculationGeneralGroup () {
        act.click(calculation);
        act.moveCursor(brgg);
        act.click(brgg_2);
        act.click(formCalculation);
        act.click(startCalculation);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        act.findAssertTrue(calculationDoneSuccess);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
