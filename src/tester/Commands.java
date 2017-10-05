/*
 */
package tester;

import java.util.ArrayList;
import java.util.Random;

/** @author Μαρία Βορεάκου it214123
*/
public class Commands {
    
    int paidia, t, energy, sweets;
    int calories, children, pointsSw, pointsC;
    ArrayList ho = new ArrayList();
    
    
    public void commands() {                            //Constructor που κατασκευάζει λίστα σπιτιών, γλυκών και παιδιών. 
        for (int j = 0; j < 214123; j++) {              //Επίσης υπάρχουν μεταβλητές που χρειάζονται για την υλοποίηση  
                                                        //της ενέργειας του Αη Βασίλη
                                                        
            Random randChild = new Random();            //Δημιουργεί τυχαίο αριθμό 
            paidia = randChild.nextInt(3) + 1;          //από 1-4 για τα παιδιά στο κάθε σπίτι
            System.out.println ("Παιδιά: " + paidia);                                                     
                        
            
            Random randSweets = new Random();           //Δημιουργεί τυχαίο αριθμό 
            sweets = randSweets.nextInt(5);             //από 0-5 για τα γλυκά στο κάθε σπίτι
            System.out.println ("Γλυκά: " + sweets);
            
            energy = paidia * 11;                       //Υπολογισμός ενέργειας που χρειάζεται ο Santa 
            System.out.println ("Ενεργεια: " + energy); //για κάθε παράδοση του ανά παιδί
                                                            
            pointsC += energy;                          //Υπολογισμός πόντων όταν ο Santa παραδίδει ένα δώρο ανά παιδί
            System.out.println ("Πόντοι ενεργειας: " + pointsC);
           
            
            calories = sweets * 7;                      //Υπολογισμός "θερμίδων" που μπορεί να πάρει ο Santa ανά γλυκό
            System.out.println ("θερμιδες: " + calories);
            
            pointsSw += calories;                       //Υπολογισμός πόντων όταν ο Santa τσιμπήσει γλυκό από σπίτι
            System.out.println ("ποντοι θερμιδων: " + pointsSw);
            
            ho.add(paidia);                     
            
            
            children += paidia;
            if (children >= 214123) {
                t = j;                                  //Θα χρησιμοποιηθεί για να βρούμε το πλήθος των σπιτιών.
                j = 250000;                             //ώστε να σταματήσει η for

            }
        }
        
    }
    
}
