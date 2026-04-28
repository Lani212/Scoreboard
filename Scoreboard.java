package model;

import java.util.Vector;

public class Scoreboard {
    private String home_name;
    private String away_name;
    private int home_score;
    private int away_score;
    private String last_action;

    private Vector<String> hist = new Vector<>();
    private Vector<Integer> phist = new Vector<>();
    

    public Scoreboard() {
        this.home_score = 0;
        this.away_score = 0;
        this.home_name = "";
        this.away_name = "";
        this.last_action = "Game Started";
        hist.add(this.last_action);
        
    }
    public void setHomeName(String nam){home_name = nam;}
    public void setAwayName(String nam){away_name = nam;}
    public void clear(){home_score=0;away_score=0;hist.clear();phist.clear(); last_action = "POINTS CLEARED";}

    public String getHomeName(){
        return home_name;
    }
    public String getAwayName(){
        return away_name;
    }
    public String getLastAction(){
        return last_action;
    }

    public void undo(){
        if(phist.isEmpty()){
            last_action = "Nothing to Undo";
            hist.add(last_action);
            return;
        }

        String undoed_action = last_action;
        last_action = "Undo " + undoed_action;
        hist.add(last_action);
        int last_point = phist.get(phist.size()-1);
        if(last_point<0){
            away_score+=last_point;
        }
        else{
            home_score-=last_point;
        }
        phist.remove(phist.size()-1);
    }
//TOUCHDOWNS
    public void hscoretd6(){
        home_score+=6;
        last_action = home_name + " (+6 TOUCHDOWN)";
        hist.add(last_action);
        phist.add(6);
    }
    public void ascoretd6(){
        away_score+=6;
        last_action = away_name + " (+6 TOUCHDOWN)";
        hist.add(last_action);
        phist.add(-6);
    }
//FIELD GOALS
    public void hscoreFS3(){
            home_score+=3;
            last_action = home_name + " (+3 FIELD SCORE)";
            hist.add(last_action);
            phist.add(3);
        }
    public void ascoreFS3(){
        away_score+=3;
        last_action = away_name + " (+3 FIELD SCORE)";
        hist.add(last_action);
        phist.add(-3);
    }

//SAFTEY
    public void hscoreS2(){
                home_score+=2;
                last_action = home_name + " (+2 SAFTEY)";
                hist.add(last_action);
                phist.add(2);
            }
    public void ascoreS2(){
        away_score+=2;
        last_action = away_name + " (+2 EXTRA POINT)";
        hist.add(last_action);
        phist.add(-2);
    }
//EXTRA POINT
    public void hscoreEP1(){
                home_score+=1;
                last_action = home_name + " (+1 EXTRA POINT)";
                hist.add(last_action);
                phist.add(1);
            }
    public void ascoreEP1(){
        away_score+=1;
        last_action = away_name + " (+1 EXTRA POINT)";
        hist.add(last_action);
        phist.add(-1);
    }





    
    //tests
    public String showhsc(){
        return Integer.toString(home_score);
    }
    public String showasc(){
        return Integer.toString(away_score);
    }
    public Vector<String> showhist(){
        return hist;
    }
    public Vector<Integer> showphist(){
        return phist;
    }


   
  

}
