/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;
import java.util.HashMap;
import java.util.Iterator;
/**
 *
 * @author rsexton17
 */
public class Gerbil {
        private int gerbilNumber;

        public Gerbil(int i) {
            gerbilNumber = i+1;
        }

	public void hop() {
		System.out.printf(" %d hopped.\n", gerbilNumber);
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
        gerbils.put("Carl", new Gerbil(0));
        gerbils.put("Kevin", new Gerbil(1));
	gerbils.put("Steve", new Gerbil(2));
	gerbils.put("Jake", new Gerbil(3));
	gerbils.put("Stacy", new Gerbil(4));
	gerbils.put("Pete", new Gerbil(5));
        gerbils.put("Dale", new Gerbil(6));
	gerbils.put("Bullwinkle", new Gerbil(7));
	gerbils.put("Rocky", new Gerbil(8));
	gerbils.put("Adrian", new Gerbil(9));
        Iterator<String> it = gerbils.keySet().iterator();
	while(it.hasNext()) {
            String s = it.next();
            System.out.printf("%s", s);
            gerbils.get(s).hop();
        }
    }
    
}
