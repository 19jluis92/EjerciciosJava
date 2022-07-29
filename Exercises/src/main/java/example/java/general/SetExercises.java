package example.java.general;

import java.util.HashSet;
import java.util.Set;

public class SetExercises {

        /**
         * Problem:
         *  - Given a Set of Player objects and a new Player with a specified rank
         *  - Add the new Player to the Set and increment the other Player’s ranks as needed,
         *    ensuring no duplicate ranks
         *  - You can assume that the existing Players have ranks from 1 to N (size of set) with no gaps
         * */

      /*  public static void main(String[] args) {
            //SetExercises rankChallenge = new SetExercises();
           // rankChallenge.run();


        }*/

        private void run(){

            Set<Player> existingPlayers = new HashSet<>();
            Player p = new Player(1, "Charlie");
            existingPlayers.add(p);
            existingPlayers.add(p);
            existingPlayers.add(new Player(2, "Alice"));
            existingPlayers.add(new Player(3, "Steve"));
            existingPlayers.add(new Player(4, "Sally"));
            existingPlayers.add(new Player(5, "Jack"));

            addPlayer(existingPlayers, new Player(3, "Kelly"));
            for (Player player :  existingPlayers) {
                System.out.println(player.rank+"   xx:  "+player.name);
            }
        }

        // Implement logic to insert newPlayer (Kelly) and update ranks of existingPlayers
        private void addPlayer(Set<Player> existingPlayers, Player newPlayer) {
            if(existingPlayers.size() + 1 != newPlayer.getRank()){

                for(Player player : existingPlayers){
                    if(player.getRank() >= newPlayer.getRank() ){
                        player.setRank(player.getRank()+1);
                    }
                }
            }
            existingPlayers.add(newPlayer);
        }


        class Player {

            int rank;
            String name;

            Player(int rank, String name) {
                this.rank = rank;
                this.name = name;
            }

            public int getRank(){
                return this.rank;
            }

            public void setRank(int newRank){
                this.rank = newRank;
            }


        }
}

