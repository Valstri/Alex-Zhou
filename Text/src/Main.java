import javafx.geometry.Pos;
import sun.security.util.Length;

import javax.xml.soap.Text;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//IDK how my code works xD
public class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Word:");
        String Word = scanner.nextLine();


        FileReader A = new FileReader("src/PH.txt");
        BufferedReader B = new BufferedReader(A);
        ArrayList<String> Ar = new ArrayList<>();
        ArrayList<String> FAr = new ArrayList<>();
        String line;
        String TextF = "";
        int i = 0;
        int a = 0;
        int h = 0;
        int g = 0;

        while ((line = B.readLine()) != null) {
            if ((line.equals("")) == false) {
                Ar.add(line);
                //System.out.println((i + 1) + " " + Ar.get(i));
                TextF = TextF + Ar.get(i) + " ";
                i++;

            }
        }
        System.out.println(TextF);



        while (a < TextF.length() - 2) {

            String J1 = TextF.substring(a + 1, a + 2);
            char J2 = J1.charAt(0);

            boolean L = (TextF.substring(a, a + 1).equals(".")) && (((TextF.substring(a + 1, a + 2).equals(" ")) || (Character.isLowerCase(J2) == false)) && (TextF.substring(a + 1, a + 2).equals(",") == false));

            if (L) {
                if (g == 0) {
                    FAr.add(TextF.substring(h, a + 1));
                    h = a;
                    System.out.println((g + 1) + "   " + FAr.get(g));
                    g++;
                }
                if (g > 0) {
                    if (TextF.substring(h + 1, a + 1).equals("") == false) {
                        FAr.add(TextF.substring(h + 1, a + 1));
                        h = a;
                        System.out.println((g + 1) + "   " + FAr.get(g));
                        g++;
                    }
                }
            }
            a++;
        }
        FAr.add(TextF.substring(h + 1 , TextF.length()));
        System.out.println((g + 1) +"   " + FAr.get(g));


        int x = 0;
        while(x < FAr.size()){
            ArrayList<Integer> LineP = new ArrayList<>();

            Search(Word, FAr.get(x));
            LineP.add(x);
            System.out.println("Line" + (1 + LineP.get(0)) + " " + "   # of Letters before: " + Search(Word, FAr.get(x)));
            x++;

        }


    }

    static String Search(String Word, String Text) {
      ArrayList<Integer> Position = new ArrayList<>();
      int i = 0;
      int g = 0;
      int Length = Word.length();
      Position.clear();
      while(i + Length < Text.length()) {
          if ((Text.substring(i, i + Length)).equals(Word)) {
            Position.add(i);
              g ++;
          }
          i ++;
          
      }return Position.toString();




    }
}
