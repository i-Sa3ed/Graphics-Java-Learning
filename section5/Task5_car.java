/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning.section5;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import javax.swing.JFrame;


public class Task5_car extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        GeneralPath path = new GeneralPath();
        path.moveTo(150, 150); // start here
        path.lineTo(50, 150);
        path.lineTo(50, 100);
        path.lineTo(100, 100);
        path.lineTo(150, 50);
        path.lineTo(250, 50);
        path.lineTo(300, 100);
        path.lineTo(350, 100);
        path.lineTo(350, 150);
        path.lineTo(250, 150);
        
        // wheels:
        path.quadTo(235, 200, 220, 150);
        path.lineTo(180, 150);
        path.quadTo(165, 200, 150, 150);
        
        g2d.draw(path);
        
        // let's paint it :)
        g2d.setPaint(new GradientPaint(350, 150, Color.blue, 50, 100, Color.pink));
        g2d.fill(path);
    }
    
    public static void main(String[] args) {
        Task5_car obj = new Task5_car();
        obj.setVisible(true);
        obj.setSize(500, 500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Task 5 - Car");
        obj.getContentPane().setBackground(Color.white);
    }
    
}
