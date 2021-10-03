package com.mashibing.tank;


public class T {

    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();
        while(true)
        {
            Thread.sleep(500);
            tf.repaint();
        }
    }
}
