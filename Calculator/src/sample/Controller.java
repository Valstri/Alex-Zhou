package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {


    public Label Monitor1;
    public Button One;
    public Button Two;
    public Button Three;
    public Button Four;
    public Button Five;
    public Button Six;
    public Button Seven;
    public Button Eight;
    public Button Nine;
    public Button Zero;
    public Label Monitor2;
    public Button Plus;
    public Button Minus;
    public Button Multi;
    public Button Divide;
    public Button Equal;
    static String FinalNum = "";
    public Button Reset;
    public Button D;
    String Op = "";
    static double Num = 0;

    public void DigitZero(ActionEvent actionEvent) {
    Builder("0");

    }

    public void DigitNine(ActionEvent actionEvent) {
   Builder("9");
    }

    public void DigitEight(ActionEvent actionEvent) {
        Builder("8");
    }

    public void DigitSeven(ActionEvent actionEvent) {
        Builder("7");
    }

    public void DigitSix(ActionEvent actionEvent) {
        Builder("6");
    }

    public void DigitFive(ActionEvent actionEvent) {
        Builder("5");
    }

    public void DigitFour(ActionEvent actionEvent) {
        Builder("4");
    }

    public void DigitThree(ActionEvent actionEvent) {
        Builder("3");
    }

    public void DigitTwo(ActionEvent actionEvent) {
        Builder("2");
    }

    public void DigitOne(ActionEvent actionEvent) {
        Builder("1");
    }

    public void Add(ActionEvent actionEvent) {
        OP("+");

    }




    public void Minus(ActionEvent actionEvent) {
        OP("-");


    }

    public void Times(ActionEvent actionEvent) {
        OP("*");
    }

    public void Divide(ActionEvent actionEvent) {
        if(FinalNum != "" + "0"){
            OP("/");
        }
        if (FinalNum == "0"){
            Monitor2.setText("Can not divided by zero");
            FinalNum = "";
            Op = "";
            Monitor1.setText("0");
        }



    }

    public void Equal(ActionEvent actionEvent) {
        if(Op == "") {
            Num = Double.parseDouble(FinalNum);

        }
        if(Op == "+"){
            Num = Num + Double.parseDouble(FinalNum);
        }
        if(Op == "*"){
            Num = Num * Double.parseDouble(FinalNum);
        }
        if(Op == "/"){
            Num = Num / Double.parseDouble(FinalNum);
        }
        if(Op == "-"){
            Num = Num - Double.parseDouble(FinalNum);
        }
        FinalNum = Double.toString(Num);
        Op = "";

        String Display = Double.toString(Num);
        Monitor2.setText(Display);

    }
    public void OP(String Operator){
        if(Op == "") {
            Num = Double.parseDouble(FinalNum);

        }
        if(Op == "+"){
            Num = Num + Double.parseDouble(FinalNum);
        }
        if(Op == "*"){
            Num = Num * Double.parseDouble(FinalNum);
        }
        if(Op == "/"){
            Num = Num / Double.parseDouble(FinalNum);
        }
        if(Op == "-"){
            Num = Num - Double.parseDouble(FinalNum);
        }
        FinalNum = "";
        Op = Operator;
    }
    public void Builder(String Digit){
        FinalNum = FinalNum + Digit;
        Monitor1.setText(FinalNum);

    }

    public void Reset(ActionEvent actionEvent) {
        FinalNum = "";
        Op = "";
        Monitor1.setText("");
        Monitor2.setText("");
    }

    public void DEC(ActionEvent actionEvent) {
        FinalNum = FinalNum + ".";
    }
}
