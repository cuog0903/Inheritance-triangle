/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author cuong
 */
public class TriangleList {

    private int size;
    Triangle triangleArray[];
    private int n; //So luong tam giac muon nhap--> so luong tam giac vuong muon nhap la size - n;

    //constructor -->De nguoi dung nhap vao kich thuoc cua mang
    public TriangleList(int size, int n) {
        this.size = size;
        this.n = n;
        triangleArray = new Triangle[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    private Scanner sc = new Scanner(System.in);
    private int count = 0;
    double edgeA, edgeB, edgeC;

    public void inputATriangle() {
        if(count < n){
        do {
            System.out.println("Input three edge of Triangle #" + (count + 1) + "/" + (triangleArray.length - n));
            System.out.print("Input Edge A: ");
            edgeA = Double.parseDouble(sc.nextLine());
            System.out.print("Input Edge B: ");
            edgeB = Double.parseDouble(sc.nextLine());
            System.out.print("Input Edge C: ");
            edgeC = Double.parseDouble(sc.nextLine());
            if (!checkTriangle(edgeA, edgeB, edgeC)) {
                System.out.println("Three Edge inputted not created a triangle. Please input other value!!!");
            }
        } while (!checkTriangle(edgeA, edgeB, edgeC));
        triangleArray[count] = new Triangle(edgeA, edgeB, edgeC);
        count++;
        }
        else{
            inputARightTriangle();
        }
    }

    public void inputARightTriangle() {
        System.out.println("Input two edge of Right Triangle #" + (count - n + 1) + "/" + (triangleArray.length - n));
        System.out.print("Input Edge A: ");
        edgeA = Double.parseDouble(sc.nextLine());
        System.out.print("Input Edge B: ");
        edgeB = Double.parseDouble(sc.nextLine());
        triangleArray[count] = new RightTriangle(edgeA, edgeB);
        count++;
    }

    public void sortTriangle() {
        System.out.println("The list of triangles before sort: ");
        for (Triangle x : triangleArray) {
            x.paint();
        }
        for (int i = 0; i < triangleArray.length - 1; i++) {
            for (int j = i + 1; j < triangleArray.length; j++) {
                if(triangleArray[i].getArea() > triangleArray[j].getArea()){
                    Triangle temp = triangleArray[i];
                    triangleArray[i] = triangleArray[j];
                    triangleArray[j] = temp;
                }
            }
        }
        System.out.println("The list of triangles after sort: ");
        for (Triangle x : triangleArray) {
            x.paint();
        }

    }

    public boolean checkTriangle(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

}
