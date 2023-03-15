/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning.section2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author saeed
 */
public class Task2_RectCorners extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(50, 50, 100, 100); // main black rect
        
        g2d.setColor(Color.white);
        g2d.fillRect(75, 40, 50, 120); // vertical white rect
        g2d.fillRect(40, 75, 120, 50);
    }
    
    public static void main(String[] args) {
        Task2_RectCorners obj = new Task2_RectCorners();
        obj.setVisible(true);
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Rectangle Corners");
        obj.setBackground(Color.white);
    }
    
}
