import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.*;

class SmartPhoneTest {

    @Test
    void setTimeZoneToBeiJingTime() {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setTimeZoneToBeiJingTime();
        assertEquals(ZonedDateTime.now().getMonth(),smartPhone.zonedDateTime.getMonth());
        assertEquals(ZonedDateTime.now().getMinute(),smartPhone.zonedDateTime.getMinute());
        assertEquals(ZonedDateTime.now().getSecond(),smartPhone.zonedDateTime.getSecond());
        assertEquals(ZonedDateTime.now().getHour(),smartPhone.zonedDateTime.getHour());
        assertEquals(ZonedDateTime.now().getYear(),smartPhone.zonedDateTime.getYear());
    }
}