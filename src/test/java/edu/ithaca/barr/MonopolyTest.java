package edu.ithaca.barr;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.Test;

public class MonopolyTest {
    
    @Test
    public void rollDieTest(){
        Player player = new Player("Top Hat");
        int location = player.getLocation();
        Monopoly.rollDie(player);
        int roll = player.getLocation() - location;
        boolean test = false;
        if (roll>1 && roll<13){
            test = true;
        }
        assertTrue(test);
    }

    @Test
    public void passGoTest(){
        Player player = new Player("Top Hat");//passing go
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
        for (int i=0; i<monopoly.getDeck().length; i++){
            if(monopoly.getDeck()[i]==next){
                flag = true;
            }
        }
        assertTrue(flag);

    }

}
