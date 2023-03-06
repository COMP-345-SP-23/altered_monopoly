package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.ithaca.barr.bank.InsufficientFundsException;

public class MonopolyTest {
    
    @Test
    public void rollDieTest(){
        Player player = new Player("Top Hat");
        int location = player.getLocation();
        Monopoly.rollDie(player);
        int roll = player.getLocation() - location;
        boolean test = false;
        if (roll>1 && roll<13){ //covers all possible values for rolling two six sided die, other values not possible
            test = true;
        }
        assertTrue(test);
    }

    @Test
    public void passGoTest(){
        Player player = new Player("Top Hat");//passing over go place
        assertEquals(1500, player.getMoney());
        player.movePiece(39, player);
        player.movePiece(5, player);
        assertEquals(1700, player.getMoney());

        Player player2 = new Player("Top Hat");//landing directly on go
        assertEquals(1500, player2.getMoney());
        player2.movePiece(30, player2);
        player2.movePiece(10, player2);
        assertEquals(1700, player2.getMoney());
    }

    @Test
    public void getNextCardTest(){
        Monopoly monopoly = new Monopoly();
        int next = monopoly.getNextCard();
        boolean flag = false;
        for (int i=0; i<monopoly.getDeck().length; i++){//pulling a card from the deck, ensuring that card is in the deck
            if(monopoly.getDeck()[i]==next){
                flag = true;
            }
        }
        assertTrue(flag);

    }

    @Test
    public void integrationTest() throws InsufficientFundsException{
        Monopoly monopoly = new Monopoly();
        Player player = new Player("Thimble");
        BoardPlaces[] board = monopoly.getBoard();

        Monopoly.rollDie(player);
        assertTrue(player.getLocation()<13 && player.getLocation()>1);
        int index = player.getLocation();

        BoardPlaces place = board[index];
        assertTrue(place.checkType()>-1 && place.checkType()<5);

        //player interacts with Property and BoardPlaces
        if (place.checkType() == 0){
            player.buyPropertyProperty((Property) place, player);
            assertEquals(1, player.getProperties().size());
        }
        
        //player interacts with RailRoadCompanies and BoardPlaces
        if (place.checkType() == 1){
            player.buyPropertyRRC((RailRoadCompanies) place, player);
            assertEquals(1, player.getRailRoadCompanies().size());
        }

        //player interacts with TaxPayments and BoardPlaces
        if (place.checkType() == 2){
            player.payUp(((TaxPayments) place).getPayment());
            assertEquals(1300, player.getMoney());
        }
        //skips 3 as its impossible to land on go to jail in the first turn and other corners do nothing
        //player interacts with BoardPlaces and Monopoly
        if (place.checkType() == 4){
            int card = monopoly.getNextCard();
            if (card<0){
                player.payUp(Math.abs(card));
            }
            else{
                player.collect(card);
            }
        }

    }

}
