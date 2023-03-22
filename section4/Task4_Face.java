/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning.section4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JFrame;

public class Task4_Face extends JFrame{
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        // main face:
        g2d.setColor(Color.yellow);
        g2d.fillOval(100, 100, 300, 300);
        
        // nose:
        g2d.setColor(Color.black);
        g2d.fillOval(230, 230, 50, 60);
        
        // mouth:
        QuadCurve2D curve = new QuadCurve2D.Double(200, 350, 250, 380, 300, 350);
        g2d.fill(curve);
        
        // eyes:
        g2d.drawOval(150, 150, 50, 30);
        g2d.drawOval(300, 150, 50, 30);
        g2d.setColor(Color.white);
        g2d.fillOval(150, 150, 50, 30);
        g2d.fillOval(300, 150, 50, 30);
        
        g2d.setColor(Color.black);
        g2d.fillOval(180, 160, 10, 10);
        g2d.fillOval(330, 160, 10, 10);
        
    }
    
    public static void main(String[] args) {
        Task4_Face obj = new Task4_Face();
        obj.setVisible(true);
        obj.setSize(500, 500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Drawing Curves");
        //obj.getContentPane().setBackground(Color.black);
    }
    
}
