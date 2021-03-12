public class Time {
    private int Hour;
    private int Min;
    private int Second;
    static private int n;
    private String A;
    private String B;
    private String C;

    Time(int Hour, int Min, int Second){
        //Convert big Value to valid value.

        if(Second > 59){
            n = (int)(Second/60);
            Second = Second - 60*n;
            Min = Min + n;
        }
        if(Min > 59){
            n = (int)(Min/60);
            Min = Min - 60 * n;
            Hour = Hour + n;
        }
        if(Hour > 23){
            n = (int)(Hour/24);
            Hour = Hour - 24*n;
        }
        this.Hour = Hour;
        this.Min = Min;
        this.Second = Second;
    }






    //Leading Zero
    String HourZero(){
        if (Hour > 9){
            A = "";
        }else A = "0";
        return A;
    }
    String MinZero(){
        if (Min > 9){
            B = "";
        }else B = "0";
        return B;
    }
    String SecZero(){
        if (Second > 9){
            C = "";
        }else C = "0";
        return C;
    }


    //Getter and Settler
    public int getHour() {
        return Hour;
    }

    public void setHour(int hour) {
        Hour = hour;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }

    public int getSecond() {
        return Second;
    }

    public void setSecond(int second) {
        Second = second;
    }
    //Convert big number to valid value
    public void setTime(int hour, int min, int sec){
        if(sec > 59){
            n = (int)sec/60;
            sec = sec - 60*n;
            min = min + n;
        }
        if(min > 59){
            n = (int)min/60;
            min = min - 60*n;
            hour = hour + n;
        }
        if(hour > 23){
            n = (int)hour/24;
            hour = hour - 24*n;
        }
        Hour = hour;
        Min = min;
        Second = sec;
    }

    //to String method
    public String toString(){
        return "Time: " + HourZero() + Hour + ":" + MinZero() + Min + ":" + SecZero() + Second;
    }





    //Add one Second method
    public void AddOneSec(){
        Second ++;
        if(Second > 59){
            Min++;
        }
        if(Min > 59){
            Hour++;
        }
        if(Hour > 23){
            Second = 0;
            Min = 0;
            Hour = 0;
        }
    }

    public void PreSec(){
        Second --;
        if(Second == -1){
            Min --;
            Second = 59;
        }
        if(Min == -1){
            Hour --;
            Min = 59;
        }
        if(Hour == -1){
            Hour = 23;
        }
    }
}
