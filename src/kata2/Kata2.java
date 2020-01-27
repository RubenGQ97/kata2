
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
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i],histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
            
        }
            for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            } 
    }
}

