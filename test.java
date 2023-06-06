import java.util.ArrayList;
import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        System.out.println("hello ");
      
        String s = "He is a very very good boy isn t he 6 _fds && sdl+ ?test";
        String[]a = s.trim().split("[ !,?._'@+]");
        ArrayList<String> listOfStrings =new ArrayList<String>(Arrays.asList(a));
        System.out.println(listOfStrings.size());
     
        for(String str:listOfStrings){
        System.out.println(str);
        }
        
    }

    
}