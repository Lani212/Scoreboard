# Scoreboard
Scoreboard that emulates football game scoreboard!
the whole project is meant to use a controller to update the scoreboard
to run, I used
javac --module-path "C:\Users\myname\Documents\CS\javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml app/App.java controller/Display.java controller/sbcontrols.java model/Scoreboard.java
 to compile, and 
 
java --module-path "C:\Users\myname\Documents\CS\javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml app.App                        
to run. 

for anyone testing to run, the areas with ("C:\Users\myname\Documents\CS\javafx-sdk-26\lib" )
should be changed.
they also need to have javafx.

the testing model runs all the functions and attempts to catch any errors and mistakes in the functions.
To run the testing, cd into the model and test as needed, compiling with
javac Main.java
javac Scoreboard.java

java Main

goodluck tester :D
