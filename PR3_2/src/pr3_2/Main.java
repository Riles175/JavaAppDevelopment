/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import pr3_2.Shape;
import java.util.Scanner;

/**
 *
 * @author rsexton17
 */
public class Main {
    
    public static void main(String[] args) {
        
        boolean cont = true;
        Rectangle r = new Rectangle(1, 1);
        Ellipse e = new Ellipse(1, 1);
        Triangle t = new Triangle(1, 1, 1);
        
        do {
            cont = true;
            System.out.print("Enter a width and height: ");
            Scanner input = new Scanner(System.in);
            int width = input.nextInt();
            System.out.print(", ");
            int height = input.nextInt();
        
            
            try {r = new Rectangle(width, height); }
        
            catch(IllegalArgumentException ex) {
                cont = false;
                System.out.println("Input values greater than zero.");
                input.nextLine();
            }
        } while (cont == false);
        
        System.out.printf("The area of the rectangle is %f\n", r.getArea());
        
        System.out.printf("The perimeter of the rectangle is %f\n", r.getPerimeter());
    
    
        do {
            cont = true;
            System.out.print("Enter two radii: ");
            Scanner input = new Scanner(System.in);
            int r1 = input.nextInt();
            System.out.print(", ");
            int r2 = input.nextInt();
        
            
            try {e = new Ellipse(r1, r2); }
        
            catch(IllegalArgumentException ex) {
                cont = false;
                System.out.println("Input values greater than zero.");
                input.nextLine();
            }
        } while (cont == false);
    
        System.out.printf("The area of the ellipse is %f\n", e.getArea());
        
        System.out.printf("The perimeter of the ellipse is %f\n", e.getPerimeter());
        
        do {
            cont = true;
            System.out.print("Enter three side lengths: ");
            Scanner input = new Scanner(System.in);
            int s1 = input.nextInt();
            System.out.print(", ");
            int s2 = input.nextInt();
            System.out.print(", ");
            int s3 = input.nextInt();
            
            try {t = new Triangle(s1, s2, s3); }
        
            catch(IllegalArgumentException ex) {
                cont = false;
                System.out.println("Input values greater than zero, or pick proper side lengths.");
                input.nextLine();
            }
        } while (cont == false);
    
        System.out.printf("The area of the ellipse is %f\n", t.getArea());
        
        System.out.printf("The perimeter of the ellipse is %f\n", t.getPerimeter());
}
}
