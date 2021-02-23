public class Problem3 {
    public static void main(String[] args) {
        int[] TAB = new int[11];
        int total = 0;
        for(int index = 1; index < TAB.length; index++){
            int result = (int) (Math.random() * 100) + 1;
            System.out.println("index: "+ index + " " + "result: " +result );
            total = total + result;
            if (index == 10){
                System.out.println("Average: " + (total/10));
            int Fifth = TAB[10];
            int Tenth = TAB[5];

            System.out.println("index: "+ index + " " + "result: " + Fifth);
            System.out.println("index: "+ index + " " + "result: " + Tenth);
            }
        }
    }
}
