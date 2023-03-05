package edu.ithaca.barr;

public abstract class BoardPlaces {
    
    private String name; //name of landing place on board
    private int type;


    public BoardPlaces(String nameIn, int typeIn){
        name = nameIn;
        type = typeIn;
    }
    /*
     * @return name
     */
    public String getName() {
        return null;
    }

    /*
     * @return type, determines what kind of BoardPlace
     */
    public int checkType() {
        return -1;
    }

}
