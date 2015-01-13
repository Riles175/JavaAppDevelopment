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
public class Ellipse extends Shape {
    
    int _radius1;
    int _radius2;
    
    public Ellipse(int r1, int r2) 
            throws IllegalArgumentException
    {
        if(r1 <= 0 || r2 <= 0)
            throw new IllegalArgumentException();
        _radius1 = r1;
        _radius2 = r2;
    }
    
    @Override
    public double getArea() { return Math.PI * _radius1 * _radius2; }
    
    @Override
    public double getPerimeter() {
        double descriminant = ((_radius1 * _radius1) + (_radius2 * _radius2))/2;
        return 2 * Math.PI * Math.sqrt(descriminant);
    } 
}
