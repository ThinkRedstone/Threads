/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q;

import java.util.Scanner;

/**
 *
 * @author Sharon
 */
public class Main {

    static Thread[] threads;
    static Scanner in;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    in = new Scanner(System.in);
    threads = new Thread[6];
    //Q1a
    for (int i = 0; i < 20; i++) {
    threads[0] = new Thread(new Q1a(in.nextDouble()));
    }
    //Q1b
    for (int i = 0; i < 40; i++) {
    threads[1] = new Thread(new Q1b(in.nextInt(), in.nextInt()));
    }
    //Q2
    for (int i = 0; i < 20; i++) {
    threads[2] = new Thread(new Q2(in.nextInt()));
    }
    //Q3
    for (int i = 0; i < 10; i++) {
    threads[3] = new Thread(new Q3(in.nextInt()));
    }
    //Q12
    for (int i = 0; i < 200; i++) {
    threads[4] = new Thread(new Q12(in.nextInt()));
    }
    //Q18
    for (int i = 1; i <= 15; i++) {
    threads[5] = new Thread(new Q18(in.nextInt(), i));
    }
    
    for (int i = 0; i < threads.length; i++) {
    threads[i].start();
    }
    
    }
    //public static void main(String[] args) {
//        threads[0] = new Thread(new Q1a(in.nextDouble()));=
//        threads[1] = new Thread(new Q1b(in.nextInt(),in.nextInt()));=
//        threads[2] = new Thread(new Q2(in.nextInt()));=
//        threads[3] = new Thread(new Q3(in.nextInt()));
//        threads[4] = new Thread(new Q12(in.nextInt()));
//        threads[5] = new Thread(new Q18(in.nextInt()));
//}
}
