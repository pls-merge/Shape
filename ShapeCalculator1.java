/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author xooos
 */
public class ShapeCalculator1 
{
    public static void main(String[] args) 
    {
        Circle cirObj = new Circle();
        cirObj.setRadius(2.5);
        
        Rectangle recObj = new Rectangle();
        recObj.setWidth(12);
        recObj.setLength(16.5);
        
        cirObj.calculateArea();
        recObj.calculateArea();
        
        cirObj.printInfo();
        recObj.printInfo();
        
        Square squObj = new Square();
        squObj.setSize(3.3);
        squObj.calculateArea();
        squObj.printInfo();
       
    }
}
