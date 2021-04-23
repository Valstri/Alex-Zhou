package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField Name;
    public TextField Age;
    public TextField Grade;
    public Button Add;
    public Button Remove;
    public Button Search;
    public ListView<Friend> Monitor = new ListView<>();
    public Label Name1;
    public Label Age1;
    public Label Grade1;
    public Label DisplayName;
    public Label DisplayAge;
    public Label DisplayGrade;

    public void Name(ActionEvent actionEvent) {
    }

    public void Age(ActionEvent actionEvent) {
    }

    public void Grade(ActionEvent actionEvent) {
    }

    public void Adder(ActionEvent actionEvent) {
        //Make sure the code won't run when nothing in the text field.
        boolean J = Name.getText().equals("") && Age.getText().equals("") && Grade.getText().equals("");
        if(J == false) {
            Friend V = new Friend(Name.getText(), Age.getText(), Grade.getText());
            Monitor.getItems().add(V);
            Name.clear();
            Age.clear();
            Grade.clear();
        }

    }

    public void Remover(ActionEvent actionEvent) {
        Friend V;
        V = Monitor.getSelectionModel().getSelectedItem();
        Monitor.getItems().remove(V);

    }

    public void Search(ActionEvent actionEvent) {
    }

    public void Property(MouseEvent mouseEvent) {
        Friend V;
        //Make sure the code won't run when nothing in the text field.
        boolean J = Name.getText().equals("") && Age.getText().equals("") && Grade.getText().equals("");
        if(Monitor.getSelectionModel() != null) {
            V = Monitor.getSelectionModel().getSelectedItem();
            DisplayName.setText(V.getName());
            DisplayAge.setText(V.getAge());
            DisplayGrade.setText(V.getGrade());
        }
    }
}
