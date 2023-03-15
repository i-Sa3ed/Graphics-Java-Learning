/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning.section3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Task3_Fan extends JFrame{
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        g2d.setBackground(Color.black);
        
        // yellow part
        g2d.setColor(Color.yellow);
        g2d.fillArc(50, 50, 200, 200, 90, 45);
        
        // blue part
        g2d.setColor(Color.blue);
        g2d.fillArc(50, 50, 200, 200, 0, 45);
        
        // green part
        g2d.setColor(Color.green);
        g2d.fillArc(50, 50, 200, 200, 315, -45);
        
        // red part
        g2d.setColor(Color.red);
        g2d.fillArc(50, 50, 200, 200, 180, 45);
        
    }
    
    public static void main(String[] args) {
        Task3_Fan obj = new Task3_Fan();
        obj.setVisible(true);
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Fan: Saeed Ahmed, section 11");
        obj.getContentPane().setBackground(Color.black);

    }
    
}
