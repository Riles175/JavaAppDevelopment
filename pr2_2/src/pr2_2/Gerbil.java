/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author rsexton17
 */
public class Gerbil {
        private static int gerbilCounter = 0;
	private int gerbilNumber = ++gerbilCounter;

	public String toString() {
		return "Gerbil " + gerbilNumber;
	}

	public void hop() {
		System.out.println(toString() + " hopped.");
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList gerbils = new ArrayList();
		for(int i = 0; i < 10; i++)
			gerbils.add(new Gerbil());
		for(Iterator it = gerbils.iterator();it.hasNext();)
			((Gerbil)it.next()).hop();
	}
    }