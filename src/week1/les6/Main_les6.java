package week1.les6;

import Practicum_4B.Klant;

public class Main_les6 {
    public static void main(String[] args) {
        var string1 = "abc";
        var string2 = "abc";
        var string3 = new String("abc");
        var string4 = new String("abc");

        var result = string3 == string4;

        System.out.println(result);
    }
        public static boolean test(){
            Object obj = "888";
            if(obj instanceof Klant) { return false; };
            return true;
        }

}
