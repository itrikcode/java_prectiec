import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class CollectionTest {
    public static void main(String[] args) {
      int id[] = {1,2,3,4,5,7};
      String name[]={"A","B","A","D","C","A"};
      double salary[]={200,300,400,500,600,600};
      List<Employee> list = new ArrayList<>();
      for(int i=0;i<=id.length-1;i++){
        Employee emp = new Employee();
        emp.setId(id[i]);
        emp.setName(name[i]);
        emp.setSalary(salary[i]);
        list.add(emp);
      }
boolean found =false;
      for(Employee e : list){
       if(e.getSalary()<500 && !(e.getName().equals("A"))){
          System.out.println(e.getId()+" :"+e.getName()+" :"+e.getSalary());
        }
    }
     
  }}
    


