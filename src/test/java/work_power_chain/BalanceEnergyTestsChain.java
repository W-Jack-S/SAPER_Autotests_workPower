package work_power_chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page_objects.TestBase;


public class BalancePowerTestsChain extends CreateCalendar {

    @Test
    void workPowerTestsChainTest00() {
        calendarTestsChainTest01();
    }

    @Test
    void balancePowerTestsChainTest01() {
        act.click(calculation);
        act.moveCursor(brgg);
        act.click(brgg_1);


    }
}
