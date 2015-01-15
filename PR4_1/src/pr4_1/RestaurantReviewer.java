/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;
import java.io.*;
/**
 *
 * @author rsexton17
 */
public class RestaurantReviewer {
    
    String _resaurantName;
    String _restaurantAddress;
    int _rating;
    String _notes;
    File f = new File("C:\\Users\\rsexton17\\Documents\\GitHub\\JavaAppDevelopment\\PR4_1\\Notes.txt");
    
    String getName() { return _resaurantName; }
    
    void setName(String name) { _resaurantName = name; }
    
    String getAddress() { return _restaurantAddress; }
    
    void setAddress(String address) { _restaurantAddress = address; }
    
    int getRating() { return _rating; }
    
    void setRating(int rating) { _rating = rating; }
    
    void setNotes(String s) { _notes = s; }
    
    void writeToFile(String s) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            wrtr.write(s);
            wrtr.newLine();
            wrtr.close();
        }
        catch (Exception ex){};
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RestaurantReviewer r = new RestaurantReviewer();
        
        r.writeToFile("Hello World");
    }
    
}
