package model;
public class main {
    public static void main(String[] args) {


        Scoreboard test = new Scoreboard();


        
        test.setAwayName("awayteam");
        test.setHomeName("aggies");


       test.ascoretd6();   // away +6
        test.hscoretd6();   // home +6
        test.hscoreFS3();   // home +3
        test.ascoreFS3();   // away +3
        test.hscoreS2();    // home +2
        test.ascoreS2();    // away +2
        test.hscoreEP1();   // home +1
        test.ascoreEP1();   // away +1
       test.undo(); //undo
        test.clear();

        System.out.println("After clear home: " + test.showhsc());
        System.out.println("After clear away: " + test.showasc());

        test.hscoretd6();
        test.hscoreFS3();
        test.undo();

       System.out.print("History: ");
       for(String s : test.showhist()){
        System.out.print(s + ", ");
       }
       System.out.println("");
       System.out.print("Points History: ");
       for(Integer i: test.showphist()){
        System.out.print(i + ", ");
       }
        Scoreboard emptyTest = new Scoreboard();
        try {
            emptyTest.undo();
            System.out.println("PASS");
        } catch (Exception e) {
            System.out.println("FAIL");
        }
       System.out.println("");
       System.out.println("away: " + test.showasc());
       System.out.println("home: " +test.showhsc());

       if (!test.getHomeName().equals("aggies")) {
            System.out.println("FAIL, bad naming home");
        } else {
            System.out.println("PASS naming home");
        }

        if (!test.getAwayName().equals("awayteam")) {
            System.out.println("FAIL, bad naming away");
        } else {
            System.out.println("PASS naming away");
        }


}}
