/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midterm;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rsexton17
 */
public class Users extends UnderOverGame {
    String _name;
    int _cash;
    int _pot;
    int _roll;
    Scanner input = new Scanner(System.in);
    Random _RNG = new Random();
    /**
     * 
     * @param name an inputed name and sets it as your user name 
     */
    void setUserName(String name) { _name = name; }
    /**
     * 
     * @return the user name
     */
    String getUserName() { return _name; }
    /**
     * sets cash to 500 if it's the first time playing
     */
    void setCash() { _cash = 500; }
    /**
     * 
     * @return cash of the user
     */
    int getCash() { return _cash; }
    
    int addCash(int b) { return _cash + b; }
    
    int subtractCash(int b) { return _cash - b; }
    /**
     * @param betValue value of the bet requested
     * @return a string s which in theory, would give a response in the GUI
     * @throws if the bet value is larger than current cash, the system will exit the function
     */
    String bet(int betValue) {
        String s;
        if(betValue > _cash) {
            System.out.println("You cannot bet what you don't have.");
            System.exit(0);
        }
        System.out.println("Seclet one... \n");
        System.out.println("1: Under 7");
        System.out.println("2: Over 7");
        System.out.println("3: 7");
        int choice = input.nextInt();
        
        switch (choice) {
            case 1:
                _pot = betValue;
                _pot = _pot*2;
                _cash = _cash - betValue;
                _roll = _RNG.nextInt(12)+1;
                if(_roll < 7) {
                    s = String.format("Congratulations %s, you won %d\n", _name, _pot);
                    _cash = _cash +_pot; 
                }
                else {
                    s = String.format("Sorry %s, you lost...\n", _name);
                }
                break;
            case 2:
                _pot = betValue;
                _pot = _pot*2;
                _cash = _cash - betValue;
                _roll = _RNG.nextInt(12)+1;
                if(_roll > 7) {
                    s = String.format("Congratulations %s, you won %d\n", _name, _pot);
                    _cash = _cash +_pot;                
                }
                else {
                    s = String.format("Sorry %s, you lost...\n", _name);
                }
                break;
            case 3:
                _pot = betValue;
                _pot = _pot*5;
                _cash = _cash - betValue;
                _roll = _RNG.nextInt(12)+1;
                if(_roll == 7) {
                    s = String.format("Congratulations %s, you won %d\n", _name, _pot);
                    _cash = _cash +_pot;                
                }
                else {
                    s = String.format("Sorry %s, you lost...\n", _name);
                }
                break;
            default:
                s = String.format("Invalid bet option, try again\n");
                break;
        }
        return s;
    }
    
}
