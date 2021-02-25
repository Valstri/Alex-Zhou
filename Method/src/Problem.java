public class Problem {
    //Q1
    static int Problem1(int addednumber) {
        int[] TAB = new int[11];
        for (int i = 0; i < TAB.length; i++) {
            TAB[i] = i;
            int output = TAB[TAB.length - 1] + addednumber;
            System.out.println("index: " + i + " result: " + TAB[i]);
            if (i == (TAB.length - 1)) {
                System.out.println("Last value: " + i + " Answer: " + output);
            }
        }
        int ans = TAB[TAB.length - 1] + addednumber;
        return ans;
    }

    //Q2
    static int Problem2(){
        int[] TAB = new int[11];
        for(int i = 0; i < TAB.length - 1; i++) {
            TAB[i] = i;
            TAB[TAB.length - 1] = 10;
            System.out.println("index: " + i + " result: " + TAB[i]);
            }
        int Output = TAB[10];
        return Output;
        }



        //Q3
    static void Problem3(int Position, int Insert){
        int[] TAB = new int[12];
        for(int i = 0; i < TAB.length; i++){
            TAB[i] = i;
            System.out.println("Position: " + i + " result: " + TAB[i]);
            if (Position == i){
                System.out.println("Position: " + i + " result: " + Insert);
                i ++;
            if(i == Position + 1);
            i--;
            }
        }
    }



    public static void main(String[] args) {
    }
}