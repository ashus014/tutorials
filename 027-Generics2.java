package com.company;

public abstract class Player {
    private String name;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
    }
}

----------------------------------------------------------------------

package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on the list");
            return false;
        }else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }
        if(ourScore < theirScore){
            lost++;
        }else{
            tied++;
        }
        played++;

        if(opponent != null){
            opponent.matchResult(null , theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }
}

----------------------------------------------------------------------

package com.company;

public class FootballPlayer extends Player{
    public FootballPlayer(String name) {
        super(name);
    }
}

--------------------------------------------------------------------

package com.company;

public class SoccerPlayer extends Player {
    public SoccerPlayer(String name) {
        super(name);
    }
}

--------------------------------------------------------------------

package com.company;

public class BaseballPlayer extends Player{

    public BaseballPlayer(String name) {
        super(name);
    }
}

--------------------------------------------------------------------

package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaidCrows = new Team<>("Adelaid Crows");

        adelaidCrows.addPlayer(joe);
//        adelaidCrows.addPlayer(pat);
//        adelaidCrows.addPlayer(beckham);

        System.out.println(adelaidCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> broken = new Team<>("this won't work");
        broken.addPlayer(beckham);

    }
}


