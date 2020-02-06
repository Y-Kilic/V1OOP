package Practicum_1;

public class Main_1 {
    public static void main(String[] args) {

        /* Opdracht 1 */
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        /* Opdracht 2 */
        var index = 1;
        while(index < 11){
            System.out.println(index);
            index = index + 1;
        }

        /* Opdracht 3 */
        for(int i = 1; i < 11; i++) {
//            var randomNumber = new java.util.Random();
            System.out.println(String.format("i is: " + i + " random is: " + Math.random()));
        }
        /* Opdracht 4 */
        int number = 0;
        for(int i = 0; i < 40; i++) {
            number = number + i;
            System.out.println(number);
        }
        /* Opdracht 5 */
        var index2 = 1;
        var letter = "";

//        while(index2 < 5){
//            index2 = index2 + 1;
//
//            if (letter == "s"){
//                System.out.println("s");
//                letter = "ss";
//                continue;
//            }
//            if (letter == "ss"){
//                System.out.println("ss");
//                letter = "s";
//                continue;
//            }
//
//        }
        while (index2 < 10) {
            if (letter.equals("ss")) {
                letter = "";
            }
            letter += "s";
            index2 += 1;
            System.out.println(letter);
        }


    }
}
