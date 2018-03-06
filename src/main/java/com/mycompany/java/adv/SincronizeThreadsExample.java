/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java.adv;

/**
 *
 * @author EducaciónIT
 */
public class SincronizeThreadsExample {
    
    public static void main(String[] args) throws InterruptedException {
        
        Incrementador inc = new Incrementador();
        
        Thread t1 = new Thread(inc);
        Thread t2 = new Thread(inc);
        Thread t3 = new Thread(inc);
        Thread t4 = new Thread(inc);
        Thread t5 = new Thread(inc);
        Thread t6 = new Thread(inc);
        Thread t7 = new Thread(inc);
        Thread t8 = new Thread(inc);
        Thread t9 = new Thread(inc);
        Thread t10 = new Thread(inc);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
                
        Thread.sleep(3000);
        
        System.out.println("resultado:"+ inc.contador);
                        
    }
    
    
    static class Incrementador implements Runnable  {
        
        int contador = 0;

        @Override
        public void run() {
            for (int i=0; i < 10; i++) {
                contador++;
            }
        }

    }
    
}


