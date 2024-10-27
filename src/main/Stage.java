/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import data.TriangleList;



/**
 *
 * @author cuong
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TriangleList arr = new TriangleList(6, 3);
        for(int i = 0; i < arr.getSize(); i++){
            arr.inputATriangle();
        }
        arr.sortTriangle();
    }
 

}
