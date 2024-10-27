/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author cuong
 */
public class RightTriangle extends Triangle{

    public RightTriangle(double edgeA, double edgeB) {
        super(edgeA, edgeB, Math.sqrt(Math.pow(edgeA, 2) + Math.pow(edgeB, 2)));
    }
    @Override
    public void paint(){
        System.out.printf("|RIGHT TRIANGLE|%3.1f|%3.1f|   |%9.1f|\n", edgeA, edgeB, getArea());
    }
}
