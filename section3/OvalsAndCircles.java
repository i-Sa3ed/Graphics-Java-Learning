/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning.section3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

public class OvalsAndCircles extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        // specify color using RGB style
        Color c = new Color(125, 130, 40); 
        g2d.setColor(c);
        g2d.drawOval(50, 50, 100, 150); // consider it as being drawn in a rect
        
        // to draw a color => width = height
        g2d.fillOval(100, 60, 70, 70);
        
        // draw using object
        g2d.setColor(Color.MAGENTA);
        Ellipse2D ellipse = new Ellipse2D.Double(30, 100, 60, 40);
        g2d.draw(ellipse);
        // also their is a fill for shapes
        g2d.setColor(Color.red);
        g2d.fill(ellipse);
        
        // draw arcs
        /*
        positive arcAngle => anti clockwise
        negative arcAngle => clockwise
        */
        g2d.setStroke(new BasicStroke(5));
        g2d.drawArc(200, 200, 50, 70, 0, -70);
        g2d.setColor(Color.green);
        g2d.fillArc(200, 200, 50, 70, 0, -70);
    }
    
    public static void main(String[] args) {
        OvalsAndCircles obj = new OvalsAndCircles();
        obj.setVisible(true);
        obj.setSize(300, 300);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Ovals and Circles");
        obj.setBackground(Color.white);
    }
}
