/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author saeed
 */

public class LinesAndColors extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        // drawing lots of points using for loops
        g2d.setColor(Color.red);
        g2d.setStroke(new BasicStroke(3));
        for (int x = 20; x <= 200; x += 10) {
            for (int y = 40; y <= 200; y += 10) {
                g2d.drawLine(x, y, x, y);
            }
        }
        
        // draw a rectangle
        g2d.setColor(Color.orange);
        g2d.drawRect(15, 30, 15, 15);
        g2d.fillRect(15, 30, 15, 15);
        
        // draw round rectangle
        g2d.setColor(Color.red);
        g2d.drawRoundRect(50, 50, 100, 70, 10, 10);
        g2d.setColor(Color.BLUE);
        g2d.fillRoundRect(50, 50, 100, 70, 10, 10);
        /*
        Notice: 
            // arcWidth = width && arcHeight = height => circle
            // arcWidth = arcHeight = 0 => normal rect
        */
        
        
    }
    
    public static void main(String[] args) {
        LinesAndColors obj = new LinesAndColors();
        obj.setVisible(true);
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Lines and Rectangles");
    }
}
