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
public class Q18 implements Runnable {

    int sum, num , i;

    @Override
    public void run() {
        
            if (i % 3 == 0) {
                sum +=num;
            }
        
        try {
            Thread.sleep((long) (Math.random() * 10000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Q1a.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Q18:" + sum);
    }

    public Q18(int num, int i) {
        this.i= i;
        this.num = num;
    }

    

}
