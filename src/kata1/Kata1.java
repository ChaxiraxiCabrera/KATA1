package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        System.out.println("Hola");
       
        Person p1;
        Date f;
        f = new Date(93,11,25);
        p1 = new Person("Chaxiraxi", "Cabrera", f);
        
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
        System.out.println("Fin");
    }
    
}
