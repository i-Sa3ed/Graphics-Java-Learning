/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics.java.learning;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;


public class Task2_House extends JFrame {
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        Graphics2D g2d = (Graphics2D) g; // cast to g2d
        
        // green floor
        g2d.setColor(Color.green);
        g2d.fillRect(0, 300, 500, 200);
        
        // black sky
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, 500, 300);
        
        // skeletal house framework
        g2d.setColor(Color.red);
        g2d.fillRect(100, 100, 300,300);
        g2d.drawLine(100, 100, 250, 50);
        g2d.drawLine(400, 100, 250, 50);
        
        // windows
        g2d.setColor(Color.white);
        g2d.fillRect(270, 120, 100, 100);
        g2d.setColor(Color.black);
        g2d.drawLine(320, 120, 320, 220);
        g2d.drawLine(270, 170, 370, 170);
        
        // door
        g2d.setColor(Color.white);
        g2d.fillRect(200, 250, 100, 150);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(4));
        g2d.drawLine(210, 300, 210, 300);
        
        // name
        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Saeed Ahmed Saeed", 150, 450);
        
        
    }
    public static void main(String[] args) {
        Task2_House obj = new Task2_House();
        obj.setVisible(true);
        obj.setSize(500, 500);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3
        obj.setLocationRelativeTo(null); // centralize 
        obj.setTitle("House Task");
    }
    
}
