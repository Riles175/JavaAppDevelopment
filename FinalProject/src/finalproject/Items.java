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
    
    /*
    * generates a pre-set list of links for the user to choose from
    */
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
    
    /*
    * writes the url and name of link into a file to be saved for future use
    */
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
    
    /*
    * adds a new name and url to the file of other links
    */
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
    
    /*
    * Takes a url and converts it into a uri
    * Returns a uri
    */
    URI convert(URL url) throws URISyntaxException { return url.toURI(); }
    
    /*
    * Takes a string
    * Opens a connection through a given url
    */
    void openConnection(String name) throws IOException, URISyntaxException {
        _url = _keys.get(name);
        _urlConnection = _url.openConnection();
        _urlConnection.connect();
        java.awt.Desktop.getDesktop().browse(convert(_url));
    }
    
    /*
    * gets the name of the link
    * returns the name
    */
    String getName() { return _name; }
    
    /*
    * gets the url of the link
    * returns the url
    */
    URL getURL() { return _url; }
    
    /*
    * takes a string
    * accesses the file given
    */
    void accessFiles(String s) throws URISyntaxException, IOException {
        openConnection(s);
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