/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author cuong
 */
public class Triangle {

    protected double edgeA;
    protected double edgeB;
    private double edgeC;

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public double getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public double getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Triangle{" + "edgeA=" + edgeA + ", edgeB=" + edgeB + ", edgeC=" + edgeC + '}';
    }

    public double getArea() {
        double p = (edgeA + edgeB + edgeC) / 2;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));

    }

    public void paint() {
        System.out.printf("|TRIANGLE      |%3.1f|%3.1f|%3.1f|%9.1f|\n", edgeA, edgeB, edgeC, getArea());
    }
}
