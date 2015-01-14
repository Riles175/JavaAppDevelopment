/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author rsexton17
 */
public class EventManager {
    
    int _day;
    int _month;
    int _year;
    String _location;
    String _eventName;
    File f = new File("C:\\Users\\rsexton17\\Documents\\GitHub\\JavaAppDevelopment\\PR3_3\\Events.txt");
    
    void setDay(int day) { _day = day; }
    void setMonth(int month) { _month = month; }
    void setYear(int year) { _year = year; }
    void setLocation(String location) { _location = location; }
    void setEventName(String eventName) { _eventName = eventName; }
    
    int getDay() { return _day; }
    int getMonth() { return _month; }
    int getYear() { return _year; }
    String getLocation() { return _location; }
    String getEventName() { return _eventName; }
    
    public void writeEvent(int d, int m, int y, String l, String e) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            wrtr.write(String.format("%d/%d/%d, %s, %s\n", m, d, y, l, e));
            wrtr.close();
        }
        catch (Exception ex) {System.out.println("An error occured"); }
    }
    
    public void getEvents() {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while((line = rdr.readLine()) != null)
                System.out.println(line);
            rdr.close();
        }
        catch (Exception ex) { System.out.println("An error occured"); }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
