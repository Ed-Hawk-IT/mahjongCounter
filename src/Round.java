package src;

import java.util.ArrayList;

public class Round {
    //subclass a position 
    public class Position {
        private Player player;
        private Score score;
        private Integer playerIncome;

        public Position(String name, Integer score, Boolean mahjong, char wind){
            this.score = new Score(score, wind, mahjong);
            this.player = new Player(name, wind);

        }
        public Player getPlayer(){
            return this.player;
        }
        public Score getScore(){
            return this.score;
        }
        public void computeIncome(Integer income){
            this.playerIncome = income;
        }
        public Integer getIncome(){
            return this.playerIncome;
        }
    }

}
