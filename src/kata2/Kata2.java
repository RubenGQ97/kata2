
package kata2;
/*

@author Ruben Garcia Quintana

*/
import java.util.*;

public class Kata2 {
    public static void main(String[] args) { 
        int [] data = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (int key : data) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key) + 1 : 1);

            
        }
            for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            } 
    }
}

