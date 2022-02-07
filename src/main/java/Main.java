import SportTeam.Manager.Manager;
import SportTeam.Team.Team;
import SportTeam.Team.TeamService;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Gregor Townsend");

        Team scotland = new Team("Scotland", manager);

        // printing out the empty space on the team
        TeamService teamService = new TeamService();

        int spaces = teamService.countEmptySpacesOnTeam(scotland);
        System.out.println(spaces);
        // OR
        System.out.println(teamService.countEmptySpacesOnTeam(scotland));
    }
}
