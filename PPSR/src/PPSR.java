import java.util.Scanner;

public class PPSR {
    public static void main(String[] args) {
        //Random part
        int PC;
        int PYS = 0;
        int PCS = 0;
        //PYS is player score and PCS is computer score.
        String P = "paper";
        String S = "Scissors";
        String R = "Rock";

        //Use while true to repeat the program.
        while (true) {
            PC = (int) (Math.random() * 3) + 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + "Paper > Rock, Rock > Scissors, Scissors > Paper");
            System.out.println("Now choose 1.Paper 2.Scissors 3.Rock 4.Exit (Enter the number only)");
            String player = scanner.next();
            if (player !="1" && player!="2"&&player!="3"&&player!="4") {
                System.out.println("Pick valid option!!");
            }else{
                int PY = Integer.parseInt(player);
                // Stop the program when player enter "4"
                if (PY == 4) {
                    break;
                }


                // Use if to print "PC" vs "PY"
                if ((PY == 1) || (PY == 2) || (PY == 3)) {
                    if (PC == 1) {
                        System.out.print("PC: " + P + " " + "vs" + " ");
                    }
                    if (PC == 2) {
                        System.out.print("PC: " + S + " " + "vs" + " ");
                    }
                    if (PC == 3) {
                        System.out.print("PC: " + R + " " + "vs" + " ");
                    }
                    if (PY == 1) {
                        System.out.print("PY: " + P);
                    }
                    if (PY == 2) {
                        System.out.print("PY: " + S);
                    }
                    if (PY == 3) {
                        System.out.print("PY: " + R);
                    }

                    //Use if to print out the result
                    boolean PYW = (PY == 1 && PC == 3) || (PY == 2 && PC == 1) || (PY == 3 && PC == 2);
                    boolean PCW = (PY == 1 && PC == 2) || (PY == 2 && PC == 3) || (PY == 3 && PC == 1);
                    //Use if to add the score
                    if (PYW) {
                        System.out.print("\n" + " You won! >w<");
                        PYS++;
                    }
                    if (PCW) {
                        System.out.print("\n" + "You lose T_T");
                        PCS++;
                    }
                    if (PY == PC) {
                        System.out.print("\n" + " Draw");
                    }

                    System.out.println("\n" + "PlayerScore: " + PYS + " " + "ComputerScore " + PCS);
                }
            }
            System.out.print("Pick valid option!!");
        }System.out.println("Thanks for playing");
    }
}
