/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sharon
 */
public class Q1a implements Runnable {

    double num;
   

    @Override
    public void run() {

       
            
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Q1a.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Q1a" + num * 1.6);
            
        
    }

    public Q1a(double num) {
        this.num = num;
    }

}
