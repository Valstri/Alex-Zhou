public class Problem4 {
    public static void main(String[] args) {
        int[] TAB = new int[11];
        int total = 0;
        for(int index = 1; index < TAB.length; index++){
            TAB[index] = (int)(Math.random()*100 + 1);
            int result = TAB[index];
            System.out.println("index: "+ index + " " + "result: " +result );
            total = total + result;
            int Fif = TAB[5];
            int sixth = TAB[6];
            if (index == 10){
                System.out.println("Average: " + (total/10));
            }
            if (index == 10){
                for(int indexR = 1; indexR < TAB.length; indexR++){
                    System.out.println("index: "+ indexR + " " + "result: " + TAB[Math.abs(indexR - 11)]);
                }
            }
        }

    }
}
