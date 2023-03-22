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

public class Curve extends JFrame{
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        g2d.setColor(Color.white);
        
        // Quadratic curve: one control point
        QuadCurve2D q2d = new QuadCurve2D.Double(50, 50, 80, 150, 110, 50);
        g2d.draw(q2d);
        g2d.setColor(Color.red);
        g2d.fill(q2d);
        
        // Cubic curve: 2 control points = more control and flexibility
        CubicCurve2D c2d = new 
            CubicCurve2D.Double(100, 100, 200, 250, 200, 250, 300, 100);
        g2d.setColor(Color.blue);
        g2d.draw(c2d);
        
    }
    
    public static void main(String[] args) {
        Curve obj = new Curve();
        obj.setVisible(true);
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Drawing Curves");
        obj.getContentPane().setBackground(Color.black);
    }
    
}
