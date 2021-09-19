package chains;

import com.automation.remarks.video.annotations.Video;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;
import page_objects.TestBase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.By.xpath;

public class AuthorizationSAPER extends TestBase {

    @BeforeEach
    public void authorizationTestsPreconditions () {
        chrome();
        initPatterns();
    }

    //@AfterEach
    //public void end(){
    //    driver.quit();
    //}

    @ParameterizedTest
    @Video
    @CsvFileSource(resources = "/Login_Base_SAPER.csv", delimiter = ';')
    public void authorizationTestSAPER(String login, String password) {
        url.saperTest();
        driver.findElement(LoginLocator).sendKeys(login);
        driver.findElement(PasswordLocator).sendKeys(password);
        driver.findElement(EnterLocator).click();
        act.click(calculation);
        act.moveCursor(brrm);
        act.click(brrm_1);
        act.click(formCalculation);
        assertFalse(act.findAssertTrue(errorNotification));
    }
}
