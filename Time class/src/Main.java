public class Main {
    public static void main(String[] args) {
    Time time = new Time(12,70,65);
        System.out.println(time.toString());
        time.AddOneSec();
        System.out.println(time.toString());
        time.PreSec();
        System.out.println(time.toString());
        time.setTime(48, 120 ,120);
        System.out.println(time.toString());

        //23:59:59
        time.setTime(23,59,59);
        time.AddOneSec();
        System.out.println(time.toString());
        time.PreSec();
        System.out.println(time.toString());
    }
}
