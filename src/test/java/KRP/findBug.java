package KRP;

import org.junit.jupiter.api.RepeatedTest;
import org.openqa.selenium.By;
import page_objects.TestBase;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class findBug extends TestBase {
    @RepeatedTest(10)
    public void test01(){
        chrome();
        initPatterns();
        url.krp();
        authorization.krpCheck("ia-svc-krp-dev", "nf0rKw4r)Sta");
        act.click(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/a[3]"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/h4[2]"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[1]/div[1]/h4"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[2]/div[1]/h4"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[3]/div[1]/h4"));
        driver.navigate().refresh();
        act.click(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/a[3]"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/h4[2]"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[1]/div[1]/h4"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[2]/div[1]/h4"));
        act.click(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[3]/div[3]/div[1]/h4"));
        driver.quit();
    }
}

