/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author rsexton17
 */
public class Rectangle extends Shape {
    
    int _width;
    int _height;
    
    public Rectangle(int width, int height) 
        throws IllegalArgumentException
    {
        if(width <= 0 || height <=0)
            throw new IllegalArgumentException();
        _width = width;
        _height = height;
    }
    
    @Override
    public double getArea() { return _width * _height; }
    
    @Override
    public double getPerimeter() { return (2 * _width) + (2 * _height); }
}
