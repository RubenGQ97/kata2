
package kata2;
/*

@author Ruben Garcia Quintana

*/
import java.util.*;

public class Kata2 {
    public static void main(String[] args) { 
        int [] data = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9};
        //Histogram histo = new Histogram(data);
        HashMap<Integer,Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);

            
        }
            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            } 
    }
}

