package edu.ithaca.barr;

import java.util.ArrayList;

public class Monopoly {
    
    private ArrayList<BoardPlaces> board; //list of all board places in correct order
    private  final String[] gamePieces = new String[]{"Top Hat", "RaceCar", "Dog", "Battleship", "Wheelbarrow", "Boot"}; //list of all pieces players can be represented as
    private ArrayList<Integer> deck; //deck of communityChestChance cards
    
    /*
     * @return board order list
     */
    public ArrayList<BoardPlaces> getBoard(){
        return null;
    }

    /*
     * rolls 2 die randomly
     * @post player will be moved along the board
     */
    public void rollDie(){

    }

    /*
     * when player makes a full loop around the game board
     * @post player's passGo check changes to true
     */
    public void passGo(){

    }

    /*
     * @return money number associated with next CommunityChestChance card
     */
    public int getNextCard(){
        return -1;
    }

    /*
     * @return String list of all pieces available to represent players
     */
    public ArrayList<String> getPieces(){
        return null;
    }

}
