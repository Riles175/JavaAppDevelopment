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
    File f = new File("Notes.txt");
    //javadoc? -4
    String getName() { return _resaurantName; }
    
    void setName(String name) { _resaurantName = name; }
    
    String getAddress() { return _restaurantAddress; }
    
    void setAddress(String address) { _restaurantAddress = address; }
    
    int getRating() { return _rating; }
    
    void setRating(int rating) { _rating = rating; } //PT -- check that rating is in [1,5]
    
    void setNotes(String s) { _notes = s; }
    
    String getNotes() { return _notes; }
    
    void writeToFile(String s) {
        try {
            try (BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true))) {
                wrtr.write(s);
                wrtr.newLine();
            }
        }
        catch (IOException ex){};
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
}
