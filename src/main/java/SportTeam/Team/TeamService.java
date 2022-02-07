package SportTeam.Team;

import SportTeam.Player.Player;

public class TeamService {




    //addManagerToTeam(Team, Manager) : void


    // default constructor
    public TeamService(){

    }

    //countEmptySpacesOnTeam(Team) : int
    //count empty space on team
    //return int
    // parameter : team
    public int countEmptySpacesOnTeam(Team team){
        // temporary variable to store count
        int count = 0;
        // loop through player array and count nulls
        for (Player player : team.getPlayers()){
            // if statement
            // if player is null add to count
            if (player == null){
                count++;
            }
        }
        //could also write
        // Player[] playersOnTheTeam = team.getPlayers();
        // for (int i = 0; i < playersOnTheTeam.length; i++){
        // if (playersOnTheTeam[i] == null){
        // count++;
        // }
        // }


        // return count
            return count;
    }
    //addPlayerToTeam(Team, Player): void
    // (as do not want to return anything)
    // below says something in this method could throw an
    // exception this let the compiler know this
    public void addPlayerToTeam(Team team, Player player) throws Exception{
      //check if empty spaces on team
       int spaces = countEmptySpacesOnTeam(team);
       // if there is add player
        if (spaces > 0){
            // get players array from team
            // add player to first available space
            // loop through players array
            // if it finds empty space, add player to it then break
          Player[] players = team.getPlayers();
            for (int i = 0; i < players.length; i++) {
                if(players[i] == null){
                    players[i] = player;
                    break;
                }
            }
        } else {
            // if it is not > 0 then throw an exception
            throw new IllegalStateException("Team is full");
        }
    }

}
