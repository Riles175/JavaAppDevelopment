/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_6;
import java.util.ArrayList;
/**
 *
 * @author rsexton17
 */
public class HomeworkTracker {
    ArrayList<Integer> scores = new  ArrayList<Integer>();
    
    void setScore(int i) { scores.add(i); }
    
    int getScore(int i) { return scores.get(i); }
    
    ArrayList<Integer> getScores() { return scores; }
    
    int Min(ArrayList<Integer> a) {
        int currentMin = 100;
        for (int i=0; i<a.size(); i ++) {
            if(a.get(i)<currentMin)
                currentMin = a.get(i);
        }
        return currentMin;
    }
    
    int Max(ArrayList<Integer> a) {
        int currentMax = 0;
        for (int i=0; i<a.size(); i++) {
            if(a.get(i)>currentMax)
                currentMax = a.get(i);
        }
        return currentMax;
    }
    
    double Average(ArrayList<Integer> a) {
        double totalSum = 0;
        for(int i=0; i<a.size(); i++) {
            totalSum = totalSum + a.get(i);
        }
        return totalSum / a.size();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
