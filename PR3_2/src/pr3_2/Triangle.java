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
public class Triangle extends Shape {
    int _side1;
    int _side2;
    int _side3;
    
    public Triangle(int s1, int s2, int s3) 
            throws IllegalArgumentException
    {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0)
            throw new IllegalArgumentException();
        if(s1 + s2 < s3 || s2 + s3 <s1 || s1 + s3 < s2)
            throw new IllegalArgumentException();
        _side1 = s1;
        _side2 = s2;
        _side3 = s3;
    }
    
    @Override
    public double getArea() {
        double p = (_side1 + _side2 + _side3)/2;
        double descriminant = p * (p-_side1) * (p-_side2) * (p-_side3);
        return Math.sqrt(descriminant);
    } 
    
    @Override
    public double getPerimeter() { return _side1 + _side2 + _side3; }
}
