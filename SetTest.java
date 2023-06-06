import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
        
    }
    
}
