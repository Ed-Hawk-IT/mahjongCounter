package src;

public class Score {
    //Individual score
    private Integer score;
    //Player Wind
    private char wind;
    //Mahjong 
    private boolean mahjong;
            
    //constructor
    public Score (int ownScore, char ownWind, boolean mahjong){
        this.score = ownScore;
        this.wind = ownWind;
        this.mahjong = mahjong;
    }
    //get atributes
    public Integer getScore(){
        return this.score;
    }
    public char getWind(){
        return this.wind;
    }
    public boolean getMahjong(){
        return this.mahjong;
   }
}
