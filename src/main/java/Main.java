import SportTeam.Manager.Manager;
import SportTeam.Player.Player;
import SportTeam.Team.Team;
import SportTeam.Team.TeamService;

public class Main {

    public static void main(String[] args) {

        Player dave = new Player("Dave", "side", 5, 3);

        Manager manager = new Manager("Gregor Townsend");

        Team scotland = new Team("Scotland", manager);

        // printing out the empty space on the team
        TeamService teamService = new TeamService();

        int spacesBefore = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesBefore);
        // OR
        System.out.println(teamService.countEmptySpacesOnTeam(scotland));

        try {
            teamService.addPlayerToTeam(scotland, dave);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        int spacesAfter = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesAfter);
    }
}
