package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("Hola");
       
        Person p1;
        Calendar f;
        f = GregorianCalendar.getInstance();
        f.set(1993, 11, 25);
        p1 = new Person("Chaxiraxi", "Cabrera", f);
        
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println(p1.getAge());
        System.out.println("Fin");
    }
    
}
