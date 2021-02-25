public class TEst {
    public static void main(String[] args) {
        int[] TAB = new int[11];
        int total = 0;
        for (int index = 1; index < TAB.length; index++) {
            int result = (int) (Math.random() * 100) + 1;
            System.out.println("index: " + index + " " + "result: " + result);
            total = total + result;
            int fifth = TAB[5];
            if (index == 10) {
                System.out.println(fifth);
                }
            }
        }
    }
