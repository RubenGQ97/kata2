
package kata2;
/*

@author Ruben Garcia Quintana

*/
import java.util.*;

public class Kata2 {
    public static void main(String[] args) { 
        String [] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
            for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            } 
    }
}


