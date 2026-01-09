import java.util.ArrayList;

public class Team {
    private String teamName;    
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void removePlayer(Player player) {
        players.remove(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void saveTeam() {
        for (Player p : players) {
            p.save();
        }
    }
    public static Team loadTeam(String teamName, ArrayList<String> playerNames) {
        Team team = new Team(teamName);
        for (String name : playerNames) {
            Player p = Player.load(name);   
            if (p != null) {
                team.addPlayer(p);
            }
        }
        return team;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team: ").append(teamName).append("\n");
        for (Player p : players) {
            sb.append(p.toString()).append("\n");       

        }   
        return sb.toString();
    } 
}     