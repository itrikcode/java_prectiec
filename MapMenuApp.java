import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapMenuApp{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Map<String,Double> map = new HashMap<>();
        while(true){
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Display Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.println("-------------");
            System.out.print("Enter you option :");
            int option = sc.nextInt();
            if(option ==1){
                System.out.println("Book Name :: ");
                String name = sc.next();
                System.out.println("Book Price");
                Double price = sc.nextDouble();
                if(map.containsKey(name)){
                    System.out.println("Book is already exists");
                }else{
                    map.put(name, price);
                    System.out.println("Book added");
                }
            }else if( option==3){
                if(map.isEmpty()){
                    System.out.println("DB Empty");
                }else{
                    Set<String> keys = map.keySet();
                   Iterator<String> it = keys.iterator();
                   System.out.println("---------------");
                   while(it.hasNext()){
                   String key = it.next();
                  Double value = map.get(key);
                  System.out.println(key+"---->"+value);
                   }
                   System.out.println("-------------");
                }
            }else if(option ==2){
                if(map.isEmpty()){
                    System.out.println("DB Empty");
                }else{
                    System.out.println("Enter Book Name");
                    String name = sc.next();
                    if(map.containsKey(name)){
                         System.out.println("Enter Updated Price");
                         Double updatedPrice = sc.nextDouble();
                         map.put(name, updatedPrice);
                         System.out.println("Price Updated ");
                    }else{
                        System.out.println(name+" Book Not Present");
                    }
                }
            } else if(option==4){
                if(map.isEmpty()){
                    System.out.println("DB Empty");
                }else{
                    System.out.println("Enter Book Name");
                    String name = sc.next();
                    if(map.containsKey(name)){
                            map.remove(name);                        
                         System.out.println(name +" Book Deleted ");
                    }else{
                        System.out.println(name+" Book Not Present");
                    }
                }
            }else if(option==5){
                System.exit(0);
            }
             else{
                System.out.println("Invalid Entery ");
            }

        }
    }
}