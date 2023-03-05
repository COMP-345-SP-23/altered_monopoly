package edu.ithaca.barr;

public class CornerActions extends BoardPlaces{

    private boolean toJail; //whether or not corner is 'go to jail'

    public CornerActions(String nameIn, boolean toJailIn){
        super(nameIn, 3);
        toJail = toJailIn;
    }

    /*
     * @return inJail, whether or not the corner is 'go to jail'
     */
    public boolean gettJail(){
        return false;
    }


}
