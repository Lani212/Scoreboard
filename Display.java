package controller;
import javafx.fxml.*;
import javafx.event.*;
import model.*;
import javafx.scene.control.*;;;



public class Display {
     @FXML private Label homescoretot;
    @FXML private Label awayscoretot;

    @FXML private Label dhn;
    @FXML private Label dan;

    @FXML private Label daction;

    
   public void updatehScore(String text) {
    homescoretot.setText(text);
    }

    public void updateaScore(String text) {
    awayscoretot.setText(text);
    }

    public void updatedac(String text){
        daction.setText(text);
    }

    public void updatehn(String text){
        dhn.setText(text);
    }
    public void updatean(String text){
        dan.setText(text);
    }
//    set all names and scores functions

//    public syncui function called after pressing button or doing thing in control.java
    
    
    
     
}