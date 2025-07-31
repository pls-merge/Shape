/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author xooos
 */
public class Circle extends Shape
{
    private final double PI = Math.PI;
    private double radius;
    
    
    public Circle() {
        super("Circle");
    }

    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        this.area = PI * radius * radius;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
