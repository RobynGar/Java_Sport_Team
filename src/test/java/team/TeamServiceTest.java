package team;

import sportTeam.manager.Manager;
import sportTeam.player.Player;
import sportTeam.team.Team;
import sportTeam.team.TeamService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TeamServiceTest {

    @Test
    public void canCountEmptySpacesOnTeamWhenEmpty() {
        // given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        TeamService underTest = new TeamService();


        // when
        int actual = underTest.countEmptySpacesOnTeam(team);

        // then
        int expected = 15;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCountEmptySpacesOnTeamWhenTeamMemberAdded() {
        // given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        TeamService underTest = new TeamService();
        Player player = new Player("test player", "winger", 11, 2);
       team.getPlayers()[0] = player;

        // when
        int actual = underTest.countEmptySpacesOnTeam(team);

        // then
        int expected = 14;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canAddPlayerToEmptyTeam() {
        // given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        TeamService underTest = new TeamService();
        Player player = new Player("test player", "winger", 11, 2);

        // when
        try {
            underTest.addPlayerToTeam(team, player);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // then

    }
}
