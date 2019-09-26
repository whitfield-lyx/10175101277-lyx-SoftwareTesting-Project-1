import java.time.LocalDateTime;
import java.time.ZoneId;

public class ClockManager {
    Clock [] clocks;
    SmartPhone smartPhone;
    String [] region ;
    public ClockManager() {
        this.clocks = new Clock[5];
        this.smartPhone = new SmartPhone();
        this.region = new String[5];
        region[0] = "伦敦";
        region[1] = "北京";
        region[2] = "纽约";
        region[3] = "莫斯科";
        region[4] = "悉尼";
    }
    public void createClock() {
        clocks[0] = new Clock(ZoneId.of("Europe/London")) ;
        clocks[1] = new Clock(ZoneId.of("Asia/Shanghai")) ;
        clocks[2] = new Clock(ZoneId.of("America/New_York")) ;
        clocks[3] = new Clock(ZoneId.of("Europe/Moscow"));
        clocks[4] = new Clock(ZoneId.of("Australia/Sydney")) ;
        }
    public void showAllTimes(){
        for(int i =0;i<clocks.length;i++) {
            System.out.println("当前"+region[i]+"时间为：");
            clocks[i].showTime();
        }
        System.out.println("*************************************************************");
        }
    public void setClockToStandard()
    {
        for(int i = 0;i<clocks.length;i++) {
            smartPhone.localDateTime = LocalDateTime.now(clocks[i].zoneId);
            clocks[i].localDateTime = smartPhone.localDateTime;
            System.out.println("校正后"+region[i]+"时间为：");
            clocks[i].showTime();
        }
        System.out.println("*************************************************************");
    }
}
