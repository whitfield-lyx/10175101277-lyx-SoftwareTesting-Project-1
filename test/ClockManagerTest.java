import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class ClockManagerTest {
    ClockManager clockManager ;

    @BeforeEach
    void  init(){
        clockManager = new ClockManager();
        clockManager.createClock();
    }

    @Test
    void createClock() {
        assertEquals(ZoneId.of("Europe/London"),clockManager.clocks[0].zoneId);
        assertEquals(ZoneId.of("Asia/Shanghai"),clockManager.clocks[1].zoneId);
        assertEquals(ZoneId.of("America/New_York"),clockManager.clocks[2].zoneId);
        assertEquals(ZoneId.of("Europe/Moscow"),clockManager.clocks[3].zoneId);
        assertEquals(ZoneId.of("Australia/Sydney"),clockManager.clocks[4].zoneId);
    }
    @Test
    void setClockToStandard() {
        for (int i = 0;i<clockManager.clocks.length;i++) {
            clockManager.clocks[i].minusFiveMinutes();
        }
        clockManager.setClockToStandard();
        for (int i = 0;i<clockManager.clocks.length;i++) {
            assertEquals(clockManager.smartPhone.zonedDateTime.withZoneSameInstant(clockManager.clocks[i].zoneId).getMonth(), clockManager.clocks[i].zonedDateTime.getMonth());
            assertEquals(clockManager.smartPhone.zonedDateTime.withZoneSameInstant(clockManager.clocks[i].zoneId).getMinute(), clockManager.clocks[i].zonedDateTime.getMinute());
            assertEquals(clockManager.smartPhone.zonedDateTime.withZoneSameInstant(clockManager.clocks[i].zoneId).getSecond(), clockManager.clocks[i].zonedDateTime.getSecond());
            assertEquals(clockManager.smartPhone.zonedDateTime.withZoneSameInstant(clockManager.clocks[i].zoneId).getHour(), clockManager.clocks[i].zonedDateTime.getHour());
            assertEquals(clockManager.smartPhone.zonedDateTime.withZoneSameInstant(clockManager.clocks[i].zoneId).getYear(), clockManager.clocks[i].zonedDateTime.getYear());
        }
    }
}