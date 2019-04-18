/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author patrickcharlton
 */
class Stopwatch {
    private long startTime = 0;
    private long stopTime = 0;
    public long elapsedTime = 0;
    private boolean running = false;
    
    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
             
}
    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
        this.elapsedTime = stopTime - startTime;
                            //or System.nanoTime() - startTime?
    }
    
    public void readout() {
        System.out.println("Filling the array took " + elapsedTime + " nanoseconds.");
    }
    
    public void reset() {
        if (!this.running) {
            this.start();
            this.stop();       
            }
        }


    public void add(int i, int i0) {
        }
}
