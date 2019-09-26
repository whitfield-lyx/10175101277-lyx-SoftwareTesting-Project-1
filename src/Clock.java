import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Clock {

    ZoneId zoneId ;
    LocalDateTime localDateTime ;
    ZonedDateTime zonedDateTime;

    public ZoneId getZoneId() {
        return zoneId;
    }
    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }
    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }

    public Clock(ZoneId zoneId) {
        this.zoneId = zoneId;
        this.localDateTime = LocalDateTime.now(zoneId);
        this.zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
    }
    public void showTime(){
        this.zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss |Z").format(zonedDateTime));
    }
    public void minusFiveMinutes()
    {
        this.localDateTime=localDateTime.minusMinutes(5);
    }
}

