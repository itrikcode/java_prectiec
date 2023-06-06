import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.naming.ldap.SortControl;

public class JvmTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        Class c1= s1.getClass();
        Class c2= s1.getClass();
        //every loaded .class file only one class ojbect well be 
        // created 
        System.out.println(JvmTest.class.getClassLoader());
        System.out.println(String.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());
        System.out.println(c1.hashCode()!=c2.hashCode());
        System.out.println( c1.getName());
        System.out.println(c1.getModifiers());
       Method[] m1  = c1.getDeclaredMethods();
       for(int i = 0;i<m1.length;i++){
        System.out.println(m1[i]);
       }
    Field[] f =   c1.getDeclaredFields();
       for(int i=0;i<f.length;i++){
        System.out.println(f[i]);
       }
        
    }

    
    
}
class Student{
    int roll_no;
    String name ;
    public int getRoll_no() {
        return roll_no;
    }
    public String getName() {
        return name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
