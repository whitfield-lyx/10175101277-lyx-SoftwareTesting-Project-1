public class Main {

    public static void main(String[] args) {
        System.out.println("欢迎来到“码农酒店”世界时钟系统！");
        ClockManager clockManager = new ClockManager();
        clockManager.smartPhone.setTimeZoneToBeiJingTime();
        clockManager.createClock();
        clockManager.showAllTimes();

        clockManager.clocks[0].minusFiveMinutes();
        clockManager.clocks[3].minusFiveMinutes();
        clockManager.showAllTimes();
        System.out.println("对世界时钟系统与智能手机进行校正！");
        clockManager.smartPhone.setTimeZoneToBeiJingTime();
        clockManager.setClockToStandard();
    }
}
