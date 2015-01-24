/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author rsexton17
 */
public class Items {
    
    String _name;
    URL _url;
    URLConnection _urlConnection;
    HashMap<String, URL> _keys = new HashMap();
    File f = new File("Items.txt");
    //BufferedReader rdr = new BufferedReader(new FileReader(f));
    
    
    public Items() throws MalformedURLException {
        _keys.put("Brakes" , new URL ("http://auto.howstuffworks.com/auto-parts/brakes/brake-types/brake.htm"));
        _keys.put("Changing Oil", new URL("http://www.howstuffworks.com/under-the-hood/vehicle-maintenance/change-oil.htm"));
        _keys.put("Changing Tires", new URL("http://www.howstuffworks.com/under-the-hood/vehicle-maintenance/change-tire.htm"));
        _keys.put("Differentials", new URL("http://www.howstuffworks.com/differential.htm"));
        _keys.put("Engine (Diesel)", new URL("http://www.howstuffworks.com/diesel.htm"));
        _keys.put("Engine (Gasoline)", new URL("http://www.howstuffworks.com/engine.htm"));
        _keys.put("Exhaust", new URL("http://www.howstuffworks.com/automotive-exhaust-system.htm"));
        _keys.put("Forced Induction (Super)", new URL("http://www.howstuffworks.com/supercharger.htm"));
        _keys.put("Forced Induction (Turbo)", new URL("http://www.howstuffworks.com/turbo.htm"));
        _keys.put("Oil", new URL("http://www.howstuffworks.com/engine-lubrication-system.htm"));
        _keys.put("Rotating Tires", new URL("http://auto.howstuffworks.com/under-the-hood/diagnosing-car-problems/body/tires-rotated.htm"));
        _keys.put("Steering Column", new URL("http://www.howstuffworks.com/steering.htm"));
        _keys.put("Suspension", new URL("http://www.howstuffworks.com/car-suspension.htm"));
        _keys.put("Transmission (Auto)", new URL("http://www.howstuffworks.com/automatic-transmission.htm"));
        _keys.put("Transmission (Manual)", new URL("http://www.howstuffworks.com/transmission.htm"));
        _keys.put("Wheels", new URL("http://www.howstuffworks.com/auto-parts/towing/equipment/accessories/tires-and-wheels.htm"));  
    }
    
    void writeTo() {
        try {
            try (BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true))) {
                String line;
                Iterator<String> it = _keys.keySet().iterator();
                while (it.hasNext()) {
                    line = it.next();
                    wrtr.write(String.format("%s\t%s", line , _keys.get(line)));
                    wrtr.newLine();
                }
            }
        }
        catch (IOException ex) { System.out.println("An error occured."); }    
    }
    
    void addTo(String name, URL url) {
        try {
            try (BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true))) {
                _keys.put(name, url);
                wrtr.write(String.format("%s\t%s", name, url));
                wrtr.newLine();
            }

        }
        catch (IOException ex) { System.out.println("An error occured."); }
    }
    
    URI convert(URL url) throws URISyntaxException { return url.toURI(); }
    
    void openConnection() throws IOException, URISyntaxException {
        _url = _keys.get(_name);
        _urlConnection = _url.openConnection();
        _urlConnection.connect();
        java.awt.Desktop.getDesktop().browse(convert(_url));
    }
    
    String getName() { return _name; }
    
    URL getURL() { return _url; }
  
    void accessFiles(String s) throws URISyntaxException {
        switch (s) {
            case "Brakes":
                try {
                    _name = "Brakes";
                    openConnection();
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
                    _name = "Changing Oil";
                    openConnection();
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
                    _name = "Changing Tires";
                    openConnection();
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
                    _name = "Differentials";
                    openConnection();
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
                    _name = "Engine (Diesel)";
                    openConnection();
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
                    _name = "Engine (Gasoline)";
                    openConnection();
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
                    _name = "Exhaust";
                    openConnection();
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
                    _name = "Forced Induction (Super)";
                    openConnection();
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
                    _name = "Forced Induction (Turbo)";
                    openConnection();
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
                    _name = "Oil";
                    openConnection();
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
                    _name = "Rotating Tires";
                    openConnection();
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
                    _name = "Steering Column";
                    openConnection();
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
                    _name = "Suspension";
                    openConnection();
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
                    _name = "Transmission (Auto)";
                    openConnection();
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
                    _name = "Transmission (Manual)";
                    openConnection();
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
                    _name = "Wheels";
                    openConnection();
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
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException {
        UserInterface my = new UserInterface();
        my.setVisible(true);
        Items i = new Items();
        i.writeTo();
    }
    
}
/*

new DefaultListModel<String>() {
    Iterator<String> it = keys.keySet().iterator();
    while(it.hasNext());
        keys.put(name, url);
}
*/