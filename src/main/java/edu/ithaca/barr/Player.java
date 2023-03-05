package edu.ithaca.barr;

import java.util.ArrayList;

public class Player {
    private String gamePiece; //player's chosen game piece to represent them
    private int money; //amount of money player has in their posession
    private ArrayList<Property> properties; //list of all of player's properties
    private ArrayList<RailRoadCompanies> railRoadCompanies; //list of all of player's railroads/companies
    private boolean jail; //true if player is currently in jail
    private int location; //index of place in list of places on the game board
    private boolean passGo; //true if player has passed go on the current turn

    /*
     * @return gamePiece
     */
    public String getGamePiece(){
        return null;
    }

    /*
     * @return money
     */
    public int getMoney(){
        return -1;
    }

    /*
     * @return arraylist of player's properties
     */
    public ArrayList<Property> getProperties(){
        return null;
    }

    /*
     * @return player's properties as a string
     */
    public String getPropertiesString(){
        return null;
    }

    /*
     * @return arraylist of player's railroads and companies
     */
    public ArrayList<RailRoadCompanies> getRailRoadCompanies(){
        return null;
    }

    /*
     * @post jail set to true if in jail, false if leaving jail
     */
    public void setJail(){

    }

    /*
     * @return jail
     */
    public boolean getJail(){
        return false;
    }

    /*
     * @return location
     */
    public int getLocation(){
        return -1;
    }

    /*
     * @post gamePiece set to chosen game piece from Monopoly game piece list
     * @param piece string of piece to represent the player
     */
    public void setGamePiece(String piece){

    }

    /*
     * @post location changes according to how many places the piece moves
     * @param palces to move the piece
     */
    public void movePiece(int places){

    }

    /*
     * @param amount of money to add to player's money
     * @post money increases by amount
     */
    public void collect(int amount){

    }

    /*
     * @param amount of money to take from player's money
     * @post money decreases by amount
     */
    public void payUp(int amount){

    }

    /*
     * @return passGo
     */
    public boolean checkPassGo(){
        return false;
    }

    /*
     * @param pass true if being sent to jail, false if leaving fail
     * @post change passGo accordingly
     */
    public void setPassGo(boolean pass){

    }

    /*
     * @param property to be removed from list
     * @post removes owner from property by calling sellProperty in Property
     */
    public void sellProperty(Property property){

    }

    /*
     * @param railRoadCompany to be removed from list
     * @post removes owner from property by calling sellProperty in RailRoadCompanies
     */
    public void sellProperty(RailRoadCompanies rrc){

    }

    
}
