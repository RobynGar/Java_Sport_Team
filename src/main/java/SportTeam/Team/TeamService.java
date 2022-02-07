package SportTeam.Team;

import SportTeam.Player.Player;

public class TeamService {
    //addPlayerToTeam(Team, Player): void
    // (as do not want to return anything)

    //countEmptySpacesOnTeam(Team) : int

    //addManagerToTeam(Team, Manager) : void


    // default constructor
    public TeamService(){

    }

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
}
