package edu.ithaca.barr;

public class RailRoadCompanies extends BoardPlaces {
    
    private Player owner; //owner of this railRoad/company
    private boolean mortgaged; //whether or not the property has been mortgaged
    private int initialCost; //cost of buying railroad/company
    private int baseRent; //cost of rent before calculating extra
    private int mortgageAmount = 200;

    public RailRoadCompanies(String nameIn, int initialCostIn, int baseRentIn){
        super(nameIn, 1);
        owner = null;
        mortgaged = false;
        initialCost = initialCostIn;
        baseRent = baseRentIn;

    }

    /*
     * temprorarily 'sells' property so player cannot collect rent from it
     * @post gets money from property once
     */
    public void mortgage(){

    }

    /*
     * @return mortgaged
     */
    public boolean getMortgage(){
        return false;
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
     * return owner
     */
    public Player getOwner(){
        return null;
    }

     /*
     * @post owner changed to new Player
     */
    public void setOwner(Player player){
        
    }

}
