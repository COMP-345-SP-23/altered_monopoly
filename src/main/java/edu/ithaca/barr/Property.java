package edu.ithaca.barr;


public class Property extends BoardPlaces {
    private int houses; //number of houses on a property
    private int hotels; //number of hotels on a property
    private Player owner; //Player object that owns the property
    private boolean mortgaged; //whether or not the property has been mortgaged
    private int initialCost; //cost of the property when initially buying
    private int baseRent; //rent cost before accounting for houses and hotels
    private int houseCost = 200;
    private int hotelCost = 200;
    private int houseRentIncrease = 200;
    private int hotelRentIncrease = 2000;
    private int mortgageAmount = 200;

    public Property(String nameIn, int initialCostIn, int baseRentIn){
        super(nameIn, 0);
        houses = 0;
        hotels = 0;
        owner = null;
        mortgaged = false;
        initialCost = initialCostIn;
        baseRent = baseRentIn;
    }
    /*
     * @post increments houses
     */
    public void buyHouse() {
        if (owner.getMoney() - houseCost >= 0){
            houses += 1;
            owner.setMoney(owner.getMoney()-houseCost);
        }
    }

    /*
     * @post increments hotels
     */
    public void buyHotel(){
        if ((owner.getMoney() - hotelCost >= 0) && (houses >= 4)){
            hotels += 1;
            houses = houses - 4;
            owner.setMoney(owner.getMoney()-hotelCost);
        }
    }

    /*
     * @post houses count decrements by 1
     */
    public void sellHouse(){
        if (houses > 0){
            houses = houses - 1;
            owner.collect((int)houseCost/2);
        }
    }

    /*
     * @post hotel count decrements by 1
     */
    public void sellHotel(){
        if (hotels > 0){
            hotels = hotels - 1;
            owner.collect((int)hotelCost/2);
        }
    }

    /*
     * @return houses
     */
    public int getHouses(){
        return houses;
    }

    /*
     * @return hotels
     */
    public int getHotels(){
        return hotels;
    }

    /*
     * @return rent cost based on initialCost, number of houses and hotels, and their percentages
     */
    public int calculateNewRent(){
        int newRent = baseRent + (houseRentIncrease * houses) + (hotelRentIncrease * hotels);
        return newRent;
    }

    /*
     * temprorarily 'sells' property so player cannot collect rent from it
     * @post gets money from property once
     */
    public void mortgage(){
        owner.collect(mortgageAmount);
        mortgaged = true;
    }

    /*
     * @return mortgaged
     */
    public boolean getMortgage(){
        return mortgaged;
    }

    /*
     * @return initialCost
     */
    public int getInitialCost(){
        return initialCost;
    }

    /*
     * @return baseRent
     */
    public int getBaseRent(){
        return baseRent;
    }

    /*
     * @return owner
     */
    public Player getOwner(){
        return owner;
    }

    /*
     * @post owner changed to new Player
     */
    public void setOwner(Player player){
        owner = player;
    }

}  
