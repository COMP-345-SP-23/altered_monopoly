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
     * return owner
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
