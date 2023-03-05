package edu.ithaca.barr;

public class Property extends BoardPlaces {
    private int houses; //number of houses on a property
    private int hotels; //number of hotels on a property
    private double houseValuePercent; //percentage to multiply by house count to find new rent amount
    private double hotelValuePercent; //percentage to multiply by hotel count to find new rent amount
    private Player owner; //Player object that owns the property
    private boolean mortgaged; //whether or not the property has been mortgaged
    private int initialCost; //cost of the property when initially buying
    private int baseRent; //rent cost before accounting for houses and hotels
    private final int type = 0;

    /*
     * @post increments houses
     */
    public void buyHouse(){

    }

    /*
     * @post increments hotels
     */
    public void buyHotel(){

    }

    /*
     * @return houses
     */
    public int getHouses(){
        return -1;
    }

    /*
     * @return hotels
     */
    public int getHotels(){
        return -1;
    }

    /*
     * @return rent cost based on initialCost, number of houses and hotels, and their percentages
     */
    public int calculateNewRent(){
        return -1;
    }

    /*
     * temprorarily 'sells' property so player cannot collect rent from it
     * @post gets money from property once
     */
    public void mortgage(){

    }

    /*
     * @post player loses money, property is added to player's list
     * @param player object determines who property belongs to
     */
    public void buyProperty(Player owner){

    }

    /*
     * @return initialCost
     */
    public int getInitialCost(){
        return -1;
    }

    /*
     * @return baseRent
     */
    public int getBaseRent(){
        return -1;
    }

    /*
     * @post resets owner to null
     * @post property removed from player's list, money given to player
     */
    public void sellProperty(){

    }

    /*
     * @return owner
     */
    public Player getOwner(){
        return null;
    }
}  
