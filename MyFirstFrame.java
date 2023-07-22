/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author pales
 */
public class MyFirstFrame extends JFrame{

    public MyFirstFrame() {
        
        setTitle("My first GUI");
        setSize(350,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setForeground(Color.red);
        setVisible(true);
    }
    
}
