import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class CollectionMenu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "1.Append \n 2.Insert \n 3.Replace \n 4.Remove \n 5.Display \n 6.Sort \n 7.Reverse \n 8.Quit");
          System.out.println("Enter option");
                    int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter employe Details ");
                int id = sc.nextInt();
                list.add(id);
                System.out.println("Element Added");
            } else if (ch == 2) {
                System.out.println("Enter index :");
                int location = sc.nextInt();
                if (location >= 0 && location <= list.size() - 1) {
                    System.out.println("Enter Element ");
                    int ele = sc.nextInt();
                    list.add(ele);
                } else {
                    System.out.println("No such Location");
                }
            } else if (ch == 3) {
                if (!list.isEmpty()) {
                    System.out.println("Enter element to replace");
                    int ele = sc.nextInt();
                    if (list.contains(ele)) {
                        int index = list.indexOf(ele);
                        System.out.println("Enter new Element ");
                        int newele = sc.nextInt();
                        list.set(index, newele);
                        System.out.println("replaced");
                    } else {
                        System.out.println("no Such elel");
                    }
                } else {
                    System.out.println("List is emplte");
                }
            } else if (ch == 4) {
                if (!list.isEmpty()) {
                    System.out.println("Enter Element to Remove");
                    int rmele = sc.nextInt();
                    if (list.contains(rmele)) {
                       int index = list.indexOf(rmele);

                        list.remove(index);
                        System.out.println("element Removed " + list);
                    } else {
                        System.out.println("No such element");
                    }
                } else {
                    System.out.println("List Is Empty");
                }
            } else if (ch == 5) {
                if (!list.isEmpty()) {
                    for (Integer i : list) {
                        System.out.println("Elemets :" + i);
                    }
                } else {
                    System.out.println("no such element");
                }

            }else if(ch==6){
                Collections.sort(list);
                System.out.println("list sorted"+list);
            }else if(ch==7){
                if(!list.isEmpty()){
                    for(int i=list.size()-1;i>=0;i--){
                        System.out.println(i);
                    }
                }else{
                    System.out.println("list is empty");
                }
            } else if (ch==8){
                System.out.println("end");
                System.exit(1);
            }else{
                System.out.println("Invalid choice");
            }

        }
    }

}
