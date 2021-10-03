package com.mashibing.tank;
import java.awt.*;
import java.awt.event.*;

public class TankFrame extends Frame {
    int x = 200;
    int y = 200;

    public TankFrame()
    {
        setSize(800,600);
        setResizable(false);
        setTitle("tank");
        setVisible(true);
        addKeyListener(new MyKeyListener());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        //g.fillRect(200,200,50,50);
        System.out.println("hello");
        g.fillRect(x,y,50,50);
        x += 20;
        //y += 20;
    }

    class MyKeyListener extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
        }
    }
}
