/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author xooos
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(String name) {
        super(name);
    }
    
    public Rectangle(double length, double width)
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
    
    public Rectangle(String name, double length, double width)
    {
        super(name);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public void calculateArea() 
    {
        this.area = length * width;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
}
