package sportTeam.team;

import sportTeam.manager.Manager;
import sportTeam.player.Player;

import java.util.Arrays;
import java.util.Objects;

public class Team {
    private Player[] players;
    private String name;
    private Manager manager;

    //default constructor
    public Team() {

    }

    // constructor
    // when creating a new team we do not already have players
    // in that team we need to add players, so we do not pass
    // Players[] in Team(). We do know that the player array
    // will not exceed 15 players as that is the number that
    // makes up a rugby team. So we can set the players array
    // size to 15, which will be the same size for every new team we create

    public Team(String name, Manager manager) {
        this.players = new Player[15];
        this.name = name;
        this.manager = manager;
    }

    public Player[] getPlayers() {
        return players;
    }
    // this refers to the property need this as we have passed
    // manager as argument so this.players refers to the
    // property players
    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}
