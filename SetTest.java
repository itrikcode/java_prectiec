import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(19);
        set.add(20);
        System.out.println(set);
        if(set.contains(19)){
            System.out.println("true");
        }

        if(!set.isEmpty()){
            System.out.println("set is not empty");
        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
           Integer n = it.next();
           System.out.println(n);
        }

        if(!set.isEmpty()){
            if(set.contains(20))
                //set.remove(20);
            System.out.println(set);
        }

        System.out.println(set.size());
        Set<Integer> set1 = new LinkedHashSet<>(); 
        set1.add(50); 
        set1.add(40); 
        set1.add(4); 
        set1.add(20); 
        set1.add(60);
        set1.add(10); 
        System.out.println("Set : " + set1);
        Set<Integer> set2 = new TreeSet<>(); 
        set2.add(50); 
        set2.add(40); 
        set2.add(4);
        set2.add(20); 
        set2.add(60);
        set2.add(10); 
        System.out.println("Set : " + set2);

   /*   [19, 20]
        true
        set is not empty
        19
        20
        [19, 20]
        2
        Set : [50, 40, 4, 20, 60, 10]
        Set : [4, 10, 20, 40, 50, 60]
      */  
    }

  
    
}
