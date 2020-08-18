package com.company;

public class Main {

    public static void main(String[] args) {

        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer backham = new SoccerPlayer("Backham");


        Team<FootBallPlayer> footBallPlayerTeam = new Team<>("Palash Dynamic");
        footBallPlayerTeam.addPlayer(joe);

        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Ghorashal Star");
        baseBallPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam  = new Team<>("Wapda Long");
       // soccerPlayerTeam.addPlayer(joe);

        System.out.println(footBallPlayerTeam.getName());

        System.out.println(baseBallPlayerTeam.numPlayers());
        System.out.println(baseBallPlayerTeam.getName());

    }
}
