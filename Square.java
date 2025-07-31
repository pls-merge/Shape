/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task01_2;

/**
 *
 * @author xooos
 */

public class Square extends Rectangle
{
    private double size;
    
    public Square()
    {
        super("Square");
        
    }
    
    public Square(double size)
    {
        super("Square", size,size);
    }
    
    public void setSize(double size)
    {
        this.size = size;
        setLength(size);
        setWidth(size);
    }
            
    
}
