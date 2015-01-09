/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4;
import java.util.Scanner;
/**
 *
 * @author rsexton17
 */
public class CalculatingPI {
        
        static double numerator = 4;
        static double denominator = 1;
        static int userInput;
        static double PIValue = 0;
        static double input;
        
        
        public static void setInput(int i) { input = i; }
        
        public static double getInput() { return input; }
        
        public static double calculate(double User) {
            for(int i=0; i<input; i++) {
                if (i%2==0) {
                    PIValue = PIValue + (numerator/denominator);
                    denominator = denominator+2;
                }
                else {
                    PIValue = PIValue - (numerator/denominator);
                    denominator = denominator+2;
                }
            }
            return PIValue;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int something;
        System.out.println("To what value of the series would you like to calculate PI?");
        Scanner s = new Scanner(System.in);
        something = s.nextInt();
        
    setInput(something);
    
    System.out.printf("%f", calculate(getInput()));  
    }
    
}
