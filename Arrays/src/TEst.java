public class TEst {
    public static void main(String[] args) {
        int[] TAB = new int[11];
        int total = 0;
        for (int index = 1; index < TAB.length; index++) {
            TAB[index] = (int) (Math.random() * 100) + 1;
            int result = TAB[index];
            System.out.println("index: " + index + " " + "result: " + result);
        }
        System.out.println(TAB[1]);
    }
}
