package tester;

/**
 * @author Μαρία Βορεάκου   it214123
 */
public class Santa {

    public Commands oEnergy;                            // oEnergy= original Energy (Αρχικη τιμη)
    public int energy, pointsSw, pointsC, calories;

    public Santa() {                                    //constructor
        oEnergy = new Commands();                       

    }

    public void energy() {                              //Ελέγχουμε την ενέργεια του Santa
        if (energy < 15) {                              //ώστε να επιβεβαιώσουμε ότι δεν θα 
            energy = energy + calories;                 //ξεμείνει και να τερματίσει το ταξίδι
            energy = energy - pointsC;                  //αλλά και να μην βαρυστομαχιάσει 
        } else if (energy <= 90) {                      //ξεπερνώντας τους πόντους ενέργειας
            energy = energy - pointsC;
        } else {
            System.out.println ("Ουπς, δεν τα καταφερε!");
        }
    }

    public int getPointsC() {                            //Καλούμε μέθοδο ώστε να μας επιστρέψει
        return pointsC;                                 //πόσους πόντους χάνει στην κάθε παράδοση παιχνιδιού
    }

    public int getPointsSw() {                          //Καλούμε μέθοδο ώστε να μας επιστρέψει
        return pointsSw;                                //πόσους πόντους μπορεί να πάρει από τα γλυκά
    }
}
