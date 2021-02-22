import java.util.Scanner;

public class PPSR {
    public static void main(String[] args) {
   //Random part
    int PC;
    PC = (int) (Math.random() * 3) + 1;

    String P = "paper";
    String S = "Scissors";
    String R = "Rock";

    //Scanner Part turn string into int by <int PY = Integer.parseInt(player)>;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Paper > Rock, Rock > Scissors, Scissors > Paper");
    System.out.println("Now choose 1.Paper, 2.Scissors or 3.Rock. (Enter the number only)");
    String player = scanner.next();
    int PY = Integer.parseInt(player);


    // Use if to print "PC" vs "PY"
    if (PC == 1){
        System.out.print("PC: " + P + " " + "vs" + " " );
    }
    if (PC == 2){
        System.out.print("PC: " + S + " " + "vs" + " " );
    }
    if (PC == 3){
        System.out.print("PC: " + R + " " + "vs" + " " );
    }
    if (PY == 1){
        System.out.print("PY: " + P);
    }
    if (PY == 2){
        System.out.print("PY: " + S);
    }
    if (PY == 3){
        System.out.print("PY: " + R);
    }

    //Use if to print out the result
    if( (PY == 1 && PC == 3) || (PY == 2 && PC == 1) || (PY == 3 && PC == 2) ){
        System.out.print(" You won! >w<");
    }
    if( (PY == 1 && PC == 2) || (PY == 2 && PC == 3) || (PY == 3 && PC == 1) ){
        System.out.print(" You lose T_T");
    }
    if (PY==PC){
        System.out.print(" Draw");
    }
    }
}
