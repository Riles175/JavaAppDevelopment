/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author rsexton17
 */
public class Items {
    
    String _name;
    URL _url;
    URLConnection _urlConnection;
    
    String getName() { return _name; }
    
    URL getURL() { return _url; }
    
    void accessFiles(String s) {
        switch (s) {
            case "Brakes":
                try {
                    _url = new URL("http://auto.howstuffworks.com/auto-parts/brakes/brake-types/brake.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;
                
            case "Changing Oil":
                try {
                    _url = new URL("http://www.howstuffworks.com/under-the-hood/vehicle-maintenance/change-oil.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;  
                
            case "Changing Tires":
                try {
                    _url = new URL("http://www.howstuffworks.com/under-the-hood/vehicle-maintenance/change-tire.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;      
             
            case "Differentials":
                try {
                    _url = new URL("http://www.howstuffworks.com/differential.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;  
                
            case "Engine (Diesel)":
                try {
                    _url = new URL("http://www.howstuffworks.com/diesel.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;      
            
            case "Engine (Gasoline)":
                try {
                    _url = new URL("http://www.howstuffworks.com/engine.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;       
            
            case "Exhaust":
                try {
                    _url = new URL("http://www.howstuffworks.com/automotive-exhaust-system.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;     
           
            case "Forced Induction (Super)":
                try {
                    _url = new URL("http://www.howstuffworks.com/supercharger.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;   
                
            case "Forced Induction (Turbo)":
                try {
                    _url = new URL("http://www.howstuffworks.com/turbo.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;       
            
            case "Oil":
                try {
                    _url = new URL("http://www.howstuffworks.com/engine-lubrication-system.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;      
            
            case "Rotating Tires":
                try {
                    _url = new URL("http://auto.howstuffworks.com/under-the-hood/diagnosing-car-problems/body/tires-rotated.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;     
            
            case "Steering Column":
                try {
                    _url = new URL("http://www.howstuffworks.com/steering.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;      
                
            case "Suspension":
                try {
                    _url = new URL("http://www.howstuffworks.com/car-suspension.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;       
           
            case "Transmission (Auto)":
                try {
                    _url = new URL("http://www.howstuffworks.com/automatic-transmission.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;    
            
            case "Transmission (Manual)":
                try {
                    _url = new URL("http://www.howstuffworks.com/transmission.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;      
            
            case "Wheels":
                try {
                    _url = new URL("http://www.howstuffworks.com/auto-parts/towing/equipment/accessories/tires-and-wheels.htm");
                    _urlConnection = _url.openConnection();
                    _urlConnection.connect();
                }
                catch (MalformedURLException e) {
                    System.out.println("Cannot access internet.");
                }
                catch (IOException e) {
                    System.out.println("Cannot access file.");
                }
            break;     
                
            default: System.out.println("Something weird happened...");
            break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
