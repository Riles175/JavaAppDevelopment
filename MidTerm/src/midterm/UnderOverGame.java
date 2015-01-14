/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midterm;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
/**
 * This program has been b.s.'d to the point of working well enough to be
 * considered a program, nothing works the way it should and I don't know why.
 * @author rsexton17
 * 
 * This program uses both GUI and the command line below, to play the game you
 * must follow very specific steps or it will fail, first, you must "OK" your
 * name before you enter a bet, you must "OK" your bet amount before you choose
 * what to bet on, you must put the bet choice in the command line and hit ENTER
 * and the process repeats. If you press "OK" under the name box, your money will
 * reset to $500, and if you put in multiple numbers in the command line before 
 * hitting "OK" under the bet box, multiple rounds will be played.
 */
public class UnderOverGame {
    
    File dataBase;
    ArrayList<Users> _users = new ArrayList<>();

    public UnderOverGame() {
        this.dataBase = new File("C:\\Users\\rsexton17\\Documents\\GitHub\\JavaAppDevelopment\\MidTerm\\dataBase.txt");
    }
    /**
    * @param userInfo a user from the users class
    * @throws error will occur if file doesn't work, which it doesn't.
    * @return pretty much returns "An error occurred"
    */
    void addToDataBase(Users userInfo) { //doesn't work and I don't know why
        try {
            BufferedWriter wrtr;
            try (BufferedReader rdr = new BufferedReader(new FileReader(dataBase))) {
                wrtr = new BufferedWriter(new FileWriter(dataBase));
                String line;
                while ((line = rdr.readLine()) != null) {
                    System.out.println(line);
                    wrtr.write(line);
                    wrtr.newLine();
                }   }
        wrtr.close();
        }
        catch (java.io.IOException ex) { System.out.println("An error occurred"); }
    }
    /**
     * currently incomplete
     * @param userInfo a user from the users class 
     */
    void editDataBase(Users userInfo) {
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}
