import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SmartPhone extends Clock {

    public SmartPhone() {
      super(ZoneId.of("Asia/Shanghai"));
    }
    public void setTimeZoneToBeiJingTime() {
        zonedDateTime = ZonedDateTime.now();
        System.out.println("设置当前智能手机为北京时间：");
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss |Z").format(zonedDateTime));
        System.out.println("*************************************************************");
    }
}
