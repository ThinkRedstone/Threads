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
public class Q12 implements Runnable{
    int count1,count2,count3,num;

    public Q12(int num) {
       
        this.num = num;
    }

    @Override
    public void run() {
        switch(num){
            case 1: count1++;
                break;
            case 2:count2++;
                break;
            case 3: count3++;
            break;
        }
        try {
                Thread.sleep((long) (Math.random() * 10000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Q1a.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("Q12:" + count1 + count2 + count3); 
    }
    
}
