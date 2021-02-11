public class Main
{
    public static void main(String[] args) {
        int random1;
        int player2;
        player2 = 3;
        random1 = (int)(Math.random()*3+1);
        //rock = 1
        //scissors = 2
        //paper = 3
        //Rock > scissors, scissors > paper, paper > rock
        //Rock vs scissors, scissors vs rock | scissors vs paper, paper vs scissors | paper vs rock, rock vs paper|
        String player1;
        if(random1 == 1) {
            System.out.println("Player1: rock");
        }
        if(random1 == 2){
            System.out.println("Player1: scissors");
        }
        if(random1 == 3){
            System.out.println("Player1: paper");
        }

        if(player2 == 1) {
            System.out.println("Player2: rock");
        }
        if(player2 == 2){
            System.out.println("Player2: scissors");
        }
        if(player2 == 3){
            System.out.println("Player2: paper");
        }



    }
}
