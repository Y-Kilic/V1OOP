package week1.les1.opdracht1_4;

import week1.les1.opdracht1_3.Student;

public class Main1_4 {
    public static void main(String[] args) {
        Student st1 = new Student("Sylvester");
        System.out.println( "getter: " + st1.getNaam() );
        System.out.println( "toString: " + st1.toString() );

        Student st2 = new Student("Karel");
        System.out.println( "getter: " + st2.getNaam() );
        System.out.println( "toString: " + st2.toString() );

    }
}
