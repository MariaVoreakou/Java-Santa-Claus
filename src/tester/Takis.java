package tester;


import java.util.ArrayList;

/**
 * @author Μαρία Βορεάκου it214123
 */

public class Takis {

    public int gifts;
    ArrayList sl = new ArrayList();

    public void SakosList() {                       //Δημιουργία λίστας δώρων από τον Τάκη
        for (int i = 0; i < 214123; i++) {

            sl.add(gifts);                          //sl= Sakoslist 
            System.out.println("gifts: " + gifts);
        }
    }
    
    public void printSakos(){    //??????????????????????
        
        System.out.println(sl.size());
        for (int i =0; i<sl.size(); i++) {
            System.out.println("Method print: " + sl.get(i));
        }
        
    }
}
