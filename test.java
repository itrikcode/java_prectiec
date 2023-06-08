import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class test{
    public static void main(String[] args) {
        String[] book = {"c","C++","java"};
        double[] prices = {200,300,100};
        Map<String,Double> map = new HashMap<>();
        for(int i=0;i<=book.length-1;i++){
            map.put(book[i], prices[i]);
        }

      Set<String> keys =  map.keySet();
     Iterator<String> it = keys.iterator();
     while(it.hasNext()){
       String key = it.next();
      Double value = map.get(key);
      System.out.println( key+" : "+value);
     }
    }

    
}