package edu.ithaca.barr;

import java.util.ArrayList;
import java.util.Random;

public class Monopoly {
    
    private BoardPlaces[] board; //list of all board places in correct order
    private  final String[] gamePieces = new String[]{"Top Hat", "RaceCar", "Dog", "Battleship", "Wheelbarrow", "Boot"}; //list of all pieces players can be represented as
    private int[] deck = new int[]{100, 500, -100, 50, -25, -50, 25}; //deck of communityChestChance cards
    
    public Monopoly(){
        board = new BoardPlaces[40];
        board[0] = new CornerActions("Go", false);
        board[1] = new Property("Meditrrnean Avenue",60 , 2);
        board[2] = new DeckPlace("Chance");
        board[3] = new Property("Baltic Avenue", 60, 4);
        board[4] = new TaxPayments("Income Tax", 200);
        board[5] = new RailRoadCompanies("Reading Railroad", 200, 25);
        board[6] = new Property("Oriental Avenue", 100, 6);
        board[7] = new DeckPlace("Chance");
        board[8] = new Property("Vermont Avenue", 100, 6);
        board[9] = new Property("Connecticut Avenue", 120, 8);
        board[10] = new CornerActions("Passing Jail", false);
        board[11] = new Property("St. Charles Place", 140, 10);
        board[12] = new RailRoadCompanies("Electric Company", 150, 30);
        board[13] = new Property("States Avenue", 140, 10);
        board[14] = new Property("Virginia Avenue", 160, 12);
        board[15] = new RailRoadCompanies("Pennsylvania Railroad", 200, 25);
        board[16] = new Property("St. James Place", 180, 14);
        board[17] = new DeckPlace("Chance");
        board[18] = new Property("Tennessee Avenue", 180, 14);
        board[19] = new Property("New York Avenue", 200, 16);
        board[20] = new CornerActions("Free Parking", false);
        board[21] = new Property("Kentucky Avenue", 220, 18);
        board[22] = new DeckPlace("Chance");
        board[23] = new Property("Indiana Avenue", 220, 18);
        board[24] = new Property("Illinois Avenue", 240, 20);
        board[25] = new RailRoadCompanies("B. & O. Railroad", 200, 25);
        board[26] = new Property("Atlantic Avenue", 260, 22);
        board[27] = new Property("Ventnor Avenue", 260, 22);
        board[28] = new RailRoadCompanies("Water Works", 150, 30);
        board[29] = new Property("Marvin Gardens", 280, 24);
        board[30] = new CornerActions("Go to Jail", true);
        board[31] = new Property("Pacific Avenue", 300, 26);
        board[32] = new Property("North Caronlina Avenue", 300, 26);
        board[33] = new DeckPlace("Chance");
        board[34] = new Property("Pennsylvania Avenue", 320, 28);
        board[35] = new RailRoadCompanies("Short Line", 200, 25);
        board[36] = new DeckPlace("Chance");
        board[37] = new Property("Park Place", 350, 35);
        board[38] = new TaxPayments("Luxury Tax", 100);
        board[39] = new Property("Boardwalk", 400, 50);
    }



    /*
     * @return board order list
     */
    public BoardPlaces[] getBoard(){
        return board;
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
