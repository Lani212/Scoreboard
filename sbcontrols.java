package controller;
import javafx.fxml.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


//import finalproj.src.model.Scoreboard;
import javafx.event.*;
import model.*;
import javafx.scene.control.*;




public class sbcontrols {


    @FXML private TextArea actions;

   @FXML private TextField newhomename;
   @FXML private Label updatehomename;
    @FXML private TextField newawayname;
    @FXML private Label updateawayname;


   private Scoreboard scoreboard = new Scoreboard();
    private Display display;

    public void setDisplay(Display s){
        this.display = s;
    }
    // //----------------------------------------------------------SYNC
    // private void syncUI() {
    //     homescoretot.setText(Integer.toString(scoreboard.showhsc()));
    //     awayscoretot.setText(Integer.toString(scoreboard.showasc()));

    //     dhn.setText(scoreboard.getHomeName());
    //     dhn.setText(scoreboard.getAwayName());

    //     daction.setText(scoreboard.getLastAction());
        
    // }

//-------------------------------------------------------------HOMESCOREUPDATING
   @FXML
   private void handleHomeTD(ActionEvent event){
    if(scoreboard.getHomeName().isEmpty()){
        
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.hscoretd6();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
   display.updatehScore(scoreboard.showhsc());
   display.updatedac(print);
   }
   @FXML
   private void handleHomeFG(ActionEvent event){
    if(scoreboard.getHomeName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.hscoreFS3();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
   display.updatehScore(scoreboard.showhsc());
   display.updatedac(print);
   }
   @FXML
   private void handleHomeS(ActionEvent event){
    if(scoreboard.getHomeName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.hscoreS2();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updatehScore(scoreboard.showhsc());
  display.updatedac(print);
   }
   @FXML
   private void handleHomeEP(ActionEvent event){
    if(scoreboard.getHomeName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.hscoreEP1();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updatehScore(scoreboard.showhsc());
  display.updatedac(print);
   }
   //--------------------------------------------------------------------------------
   //-------------------------------------------------------------AWAYSCOREUPDATE
   @FXML
   private void handleawayTD(ActionEvent event){
    if(scoreboard.getAwayName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.ascoretd6();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updateaScore(scoreboard.showasc());
  display.updatedac(print);
   }

   @FXML
   private void handleawayFG(ActionEvent event){
    if(scoreboard.getAwayName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.ascoreFS3();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updateaScore(scoreboard.showasc());
  display.updatedac(print);
   }
   @FXML
   private void handleawayS(ActionEvent event){
    if(scoreboard.getAwayName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.ascoreS2();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updateaScore(scoreboard.showasc());
  display.updatedac(print);
   }
   @FXML
   private void handleawayEP(ActionEvent event){
    if(scoreboard.getAwayName().isEmpty()){
        actions.appendText("ERROR: EMPTY NAME" + "\n");
        display.updatedac("ERROR: NAME IS EMPTY");
        return;
    }
    scoreboard.ascoreEP1();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
  display.updateaScore(scoreboard.showasc());
  display.updatedac(print);
   }
 //----------------------------------------------------------------------UPDATING NAMES
   @FXML
   private void updatehn(){
    String nhn = newhomename.getText();
    updatehomename.setText(nhn);
    scoreboard.setHomeName(nhn);
    display.updatehn(nhn);

    
   }
   @FXML
   private void updatean(){
    String nan = newawayname.getText();
    updateawayname.setText(nan);
    scoreboard.setAwayName(nan);
    display.updatean(nan);

    
   }
   //----------------------------------------------------------------------UNDO AND CEAR GAME
   @FXML
   private void undoac(ActionEvent event){
    scoreboard.undo();
    String print = scoreboard.showhist().lastElement();
    actions.appendText(print + "\n");
    display.updateaScore(scoreboard.showasc());
    display.updatehScore(scoreboard.showhsc());
    display.updatedac(print);
  
   }

   @FXML
   private void clearg(ActionEvent event){
    scoreboard.clear();


    actions.appendText(scoreboard.getLastAction() + "\n");
    display.updateaScore(scoreboard.showasc());
    display.updatehScore(scoreboard.showhsc());
    display.updatedac(scoreboard.getLastAction());
  
   }
   
   
     
}