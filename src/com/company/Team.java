package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Team<T> {
    private  String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tried = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(((Player) player).getName() + " is already on the team");
            return false;
        }else {
            members.add(player);
            System.out.println(((Player) player).getName() + " Peaked for team " + this.name);
            return true;
        }
    }


    public int numPlayers(){
        return this.members.size();
    }


    public void matchResult(Team opponent,int theirScore, int ourScore){
        if (ourScore>theirScore){
            won++;
        }else if(ourScore == theirScore){
            tried++;
        }else {
            lost++;
        }

        played++;
        if (opponent != null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }


    public int ranking(){
        return (won * 2) + tried;
    }





}
