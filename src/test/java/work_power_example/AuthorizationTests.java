package work_power_example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import page_objects.ReadFile;
import page_objects.TestBase;

import java.io.IOException;

public class AuthorizationTests extends TestBase {
    @BeforeMethod//АВТОРИЗАЦИЯ ПОЛЬЗОВАТЕЛЕМ ДЕПАРТАМЕНТА РДУ
    void authorizationTestsPreconditions () {
        chrome();
        initPatterns();
        url.saperDev();
    }
    @DataProvider(name = "LoginExcelDataProvider")
    public Object[][] excelData() throws IOException {
        return new ReadFile().readExcel();
    }
}
//authorizationListExcel
