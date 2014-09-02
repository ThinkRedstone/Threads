/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sharon
 */
public class Q3 implements Runnable{
    int num;


    @Override
    public void run() {

      
     
            try {
                Thread.sleep((long) (Math.random() * 10000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Q1a.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Q3:"+ (num%10+num/10+num/100));
        
    }

    public Q3(int num) {
        this.num = num;
    }
    
}
