package edu.ithaca.barr;

import java.util.ArrayList;

import edu.ithaca.barr.bank.InsufficientFundsException;

public class Player {
    private String gamePiece; //player's chosen game piece to represent them
    private int money; //amount of money player has in their posession
    private ArrayList<Property> properties; //list of all of player's properties
    private ArrayList<RailRoadCompanies> railRoadCompanies; //list of all of player's railroads/companies
    private boolean jail; //true if player is currently in jail
    private int location; //index of place in list of places on the game board

    public Player(String gamePieceIn){
        gamePiece = gamePieceIn;
        money = 1500;
        properties = new ArrayList<Property>();
        railRoadCompanies = new ArrayList<RailRoadCompanies>();
        jail = false;
        location = 0;
    }

    /*
     * @return money
     */
    public int getMoney(){
        return money;
    }

    /*
     * @param moneyIn amount to set money to
     * @post money becomes new value
     */
    public void setMoney(int moneyIn){
        money = moneyIn;
    }

    /*
     * @return arraylist of player's properties
     */
    public ArrayList<Property> getProperties(){
        return properties;
    }

    /*
     * @return player's properties as a string
     */
    public String getPropertiesString(){
        String string = "";
        for (int i=0; i<properties.size(); i++){
            Property prop = properties.get(i);
            string = string + prop.getName() + ": " + 
                prop.getHouses() + " houses, " + prop.getHotels() 
                + " hotels, base rent: " + prop.getBaseRent() 
                + ", mortgaged: " + prop.getMortgage() + "\n";
        }
        for (int a=0; a<railRoadCompanies.size(); a++){
            RailRoadCompanies rrc = railRoadCompanies.get(a);
            string = string + rrc.getName() + ": rent: " + rrc.getBaseRent() + ", " + "mortgaged: " + rrc.getMortgage() + "\n";
        }
        
        return string;
    }

    /*
     * @return arraylist of player's railroads and companies
     */
    public ArrayList<RailRoadCompanies> getRailRoadCompanies(){
        return railRoadCompanies;
    }

    /*
     * @post jail set to true if in jail, false if leaving jail
     * @param jail true if in jail, false if leaving jail
     */
    public void setJail(boolean jailIn){
        jail = jailIn;
    }

    /*
     * @return jail
     */
    public boolean getJail(){
        return jail;
    }

    /*
     * @return location
     */
    public int getLocation(){
        return location;
    }

    /*
     * @post gamePiece set to chosen game piece from Monopoly game piece list
     * @param piece string of piece to represent the player
     */
    public void setGamePiece(String piece){
        gamePiece = piece;
    }

    /*
     * @post location changes according to how many places the piece moves
     * @param palces to move the piece
     */
    public void movePiece(int places, Player player){
        if (location+places>39){
            int toGo = places - (39 - location);
            location = toGo - 1;
            Monopoly.passGo(player);
        }
        else{
            location = location + places;
        }
    }

    /*
     * @param amount of money to add to player's money
     * @post money increases by amount
     */
    public void collect(int amount){
        money = money + amount;
    }

    /*
     * @param amount of money to take from player's money
     * @post money decreases by amount
     */
    public void payUp(int amount) throws InsufficientFundsException{
        if (money - amount >= 0){
            money = money - amount;
        }
        else{
            throw new InsufficientFundsException("Not enough money, need to sell houses/hotels or mortgage property");
        }
    }
    
    /*
     * @post player loses money, property is added to player's list
     * @param property to be bought
     */
    public void buyPropertyProperty(Property property, Player player){
        if (property.getInitialCost()<= money){
            property.setOwner(player);
            money = money - property.getInitialCost();
            properties.add(property);
        }
    }

    /*
     * @post player loses money, property is added to player's list
     * @param player object determines who property belongs to
     */
    public void buyPropertyRRC(RailRoadCompanies rrc, Player player){
        if (rrc.getInitialCost()<= money){
            rrc.setOwner(player);
            money = money - rrc.getInitialCost();
            railRoadCompanies.add(rrc);
        }

    }

    /*
     * @return gamePiece
     */
    public String getGamePiece(){
        return gamePiece;
    }

    
}
