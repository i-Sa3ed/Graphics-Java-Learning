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

public class DrawPolygon extends JFrame{
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        // to draw a polygon: we need to specify x array and y array
        int [] x = {50, 150, 150, 200, 150, 150, 50};
        int [] y = {100, 100, 50, 125, 200, 150, 150};
//        g2d.drawPolygon(x, y, 7);
//        // also we can fill it
//        g2d.setColor(Color.red);
//        g2d.fillPolygon(x, y, 7);
//        
//        // notice the difference with draw polyline (first and last point)
//        int [] x2 = {50, 150, 150, 200, 150, 150, 50}; 
//        int [] y2 = {200, 200, 150, 225, 300, 250, 250};
//        g2d.drawPolyline(x2, y2, 7);
//        
        // to draw a shape of lines and curves => General Path
        GeneralPath path = new GeneralPath();
        path.moveTo(150, 450); // the starting point
        path.lineTo(350, 450); // draw a line to this point
        path.lineTo(350, 250);
        path.quadTo(250, 50, 150, 250); // control point, final point
        path.lineTo(150, 450); 
        // this also will do the same
        path.closePath();
        
        g2d.draw(path);
        
        // to fill with a gradient.. just use 'Gradient' :)
        g2d.setPaint(new GradientPaint(150, 450, Color.red, 350, 250, Color.blue));
        g2d.fill(path);
    }
    
    public static void main(String[] args) {
        DrawPolygon obj = new DrawPolygon();
        obj.setVisible(true);
        obj.setSize(500, 500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("Draw Polygon");
        obj.getContentPane().setBackground(Color.white);
    }
    
}