/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.ArrayList;

/**
 * @author Μαρία Βορεάκου it214123
 */
public class Tester {

    int paidia, t, energy, sweets;
    int calories, children, pointsSw, pointsC;
    ArrayList ho = new ArrayList();
    

    public static void main(String[] args) {

        Commands c =new Commands();  
        c.commands();
        Takis t =new Takis();
        t.printSakos();
        Santa s =new Santa();
        s.energy();
    }
    
   
    
    public void printHouses(){
        System.out.println("print menthod entered");
        System.out.println(ho.size());
        for (int i =0; i<ho.size(); i++) {
            System.out.println("Method print: " + ho.get(i));
        }
        
    }

    
      
    
    
}

