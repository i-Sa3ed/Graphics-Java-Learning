/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphics.java.learning;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import javax.swing.JFrame; // to use JFrame class

/**
 *
 * @author saeed
 */
public class FirstApplication extends JFrame {
    // notice that we inherits from JFrame
    
    // we can use this function to draw in the frame
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        /** Draw a String **/
        
        // set a specific color
        g.setColor(Color.BLUE);
        // set the font
        g.setFont(new Font("Arial", Font.ITALIC, 20));
        g.drawString("This is my first string ;)", 10, 50); // 10, 50 => borders of the frame
        
        /** Draw a Line **/
        
        g.setColor(Color.red);
        Graphics2D g2d = (Graphics2D) g; // cast from Graphics to Graphics2D
        
        // adjust the stroke of the line
        g2d.setStroke(new BasicStroke(3));
        
        g2d.drawLine(10, 60, 200, 60);
        
        // another way to draw a line
        g2d.setColor(Color.orange);
        g2d.draw(new Line2D.Double(55.5, 100, 70, 110));
        
        /** Draw a Point **/
        // like the line, but the end point = start point
        g2d.setColor(Color.GREEN);
        g2d.drawLine(77, 90, 77, 90);
    }

    public static void main(String[] args) {
        FirstApplication obj = new FirstApplication();
        // now my obj has all functions in JFrame
        
        // make my frame visible
        obj.setVisible(true);
        
        // set width and height (in pixels)
        obj.setSize(500, 500); 
        
        // close run when the frame closed
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // = 3
        
        /// adjust location of the frame
        obj.setLocation(100, 100);
        
        obj.setLocationRelativeTo(null); // centralize it in the screen
        
        // add title to the frame
        obj.setTitle("Saeed Project");
        
        // adjust frame bg color
        obj.getContentPane().setBackground(Color.yellow);
    }
}
