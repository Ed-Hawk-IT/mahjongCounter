package src;

public class Player {
    private String name;
    private char currentWind;

    public Player(String playerName, char wind){
        this.currentWind = wind;
        this.name = playerName;
    }

    public String getName(){
        return this.name;
    }
    public char getCurrentWind(){
        return this.currentWind;
    }
}
