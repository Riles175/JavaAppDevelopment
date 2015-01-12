/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @description takes 10 integers and calculates max, min, and average also 
 * throws exceptions if type other than integer is entered
 * @author rsexton17
 */
public class IntegerValues {
    
    // initialized array of integers
    ArrayList<Integer> _userInput = new ArrayList<Integer>();
    
    
    //takes an object, checks for type, if type integer, adds to _userInput
    //if another type, throws an exception
    void addToArrayList(Object i)
        throws IllegalArgumentException  
    {
        if(i.getClass() != Integer.class)
                throw new IllegalArgumentException();
        _userInput.add((Integer) i); 
    }
    
    //gets _userInput
    ArrayList<Integer> getArrayList() { return _userInput; }
    
    //calculates max value from _userInput
    int Max() {
        int temp = 0;
        for (int i=0; i<_userInput.size(); i++) {
            if(temp < _userInput.get(i)) 
            {
                temp = _userInput.get(i);
            }
        }
        return temp;
    }
    
    //calculates min value from _userInput
    int Min() {
        int temp = 1000000000;
        for (int i=0; i<_userInput.size(); i++) {
            if(temp > _userInput.get(i)) 
            {
                temp = _userInput.get(i);
            }
        }
        return temp;}
    
    // calculates average from _userInput
    double Average() { 
        int sum = 0;
        for (int i=0; i<_userInput.size(); i++) {
            sum = sum + _userInput.get(i);
        }
        return sum/10;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntegerValues values = new IntegerValues();
        
        System.out.println("Enter 10 integers:\n");
        
        Scanner x = new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            
            System.out.printf("Value %d: ", i+1);
            
            try { values.addToArrayList(x.nextInt()); }
            
            catch (Exception ex) { x.nextLine(); i--; }
        }
        
        System.out.println("The max is: ");
        System.out.printf("%d\n", values.Max());
        
        System.out.println("The min is: ");
        System.out.printf("%d\n", values.Min());
        
        System.out.println("The average is: ");
        System.out.printf("%f\n", values.Average());
    }
    
}
