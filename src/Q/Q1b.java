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
public class Q1b implements Runnable {

    int num, num2;

    @Override
    public void run() {

        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Q1a.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Q1b" + ((num + num2) / 2));
    }

    public Q1b(int num, int num2) {
        this.num = num;
        this.num2 = num2;
    }

}
