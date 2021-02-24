public class Array {
    public static void main(String[] args) {
        int[] TAB = new int[21];
        int counter = 0;
        for(int i = 1 ; i < TAB.length; i++){
            int FN = (int)(Math.random() * 6 + 1);
            TAB[FN] = (int)(Math.random()*6)+1;
            System.out.println("index:" + i + "||" + "result:" + FN);
            if (FN == 1){
                counter++;
            }
            if(i == 20) {
                System.out.println("\n" + "Number of one:" + counter);
            }
        }
    }
}
