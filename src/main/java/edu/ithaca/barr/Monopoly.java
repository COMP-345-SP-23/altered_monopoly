package edu.ithaca.barr;

import java.util.ArrayList;
import java.util.Random;

public class Monopoly {
    
    private ArrayList<BoardPlaces> board; //list of all board places in correct order
    private  final String[] gamePieces = new String[]{"Top Hat", "RaceCar", "Dog", "Battleship", "Wheelbarrow", "Boot"}; //list of all pieces players can be represented as
    private int[] deck = new int[]{100, 500, -100, 50, -25, -50, 25}; //deck of communityChestChance cards
    
    /*
     * @return board order list
     */
    public ArrayList<BoardPlaces> getBoard(){
        return null;
    }

    /*
     * rolls 2 die randomly
     * @param player's turn to roll and move along board
     * @post player will be moved along the board
     */
    public static void rollDie(Player player){
        Random rand = new Random();
        int min = 1;
        int max = 6;
        int dice1 = rand.nextInt(max - min + 1) + min;
        int dice2 = rand.nextInt(max - min + 1) + min;
        int roll = dice1 + dice2;
        player.movePiece(roll, player);
    }

    /*
     * when player makes a full loop around the game board
     * @param which player will be receiving the money
     * @post player recieves 200
     */
    public static void passGo(Player player){
        player.collect(200);
    }

    /*
     * @return money number associated with next CommunityChestChance card
     */
    public int getNextCard(){
        Random rand = new Random();
        int min = 0;
        int max = deck.length - 1;
        return deck[rand.nextInt(max - min + 1) + min];
    }

    /*
     * @return String list of all pieces available to represent players
     */
    public String[] getPieces(){
        return gamePieces;
    }

    /*
     * @return deck
     */
    public int[] getDeck(){
        return deck;
    }

}
