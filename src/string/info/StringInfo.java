package string.info;

import java.util.Scanner;

public class StringInfo {
    Scanner fetch = new Scanner(System.in);
    private int letters_in_name = 0;

    StringInfo() {
        System.out.println("Write your full name! (first name & last name)");
        String name = fetch.nextLine();

        System.out.print("Length of your name: ");
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') letters_in_name++;
        }
        System.out.println(letters_in_name);
        System.out.println("----------");


        int nextIndex = 0;
        System.out.print("last letter of your first name: ");
        for (int i = 0; i < name.length(); i++) {
            if (i + 2 < name.length() && name.substring(i + 1, i + 2).equals(" ")) {
                System.out.println(name.charAt(i));
                System.out.println("----------");
                nextIndex = i + 3;
                break;
            }
        }

        System.out.print("last letter of your last name: ");
        for (int i = nextIndex; i < name.length(); i++) {
            if (i + 1 == name.length()) {
                System.out.println(name.charAt(i));
                System.out.println("----------");
                break;
            }
        }

        int e = name.indexOf('e');
        System.out.println("location of first e: letter " + (e + 1));
        System.out.println("----------");

        System.out.print("Your first name (in case you forgor): ");
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i,i+1).equals(" ")){
                System.out.println(name.substring(0,i));
                System.out.println("----------");
            }
        }

        int countVowels = 0;
        char[] vowels = {'a','e','i','o','u','y'};
        System.out.print("the amount of vowels in your name: ");
        for (int i = 0; i < vowels.length; i++){
            for (int j = 0, k = 0; j < name.length(); j++){
                if (name.charAt(j) == vowels[i]){
                    countVowels++;
                }
            }
        }
        System.out.println(countVowels);
        System.out.println("----------");

        String modified = "";
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' ||
                name.charAt(i) == 'i' || name.charAt(i) == 'o' ||
                name.charAt(i) == 'u' || name.charAt(i) == 'y')
            {
                char c = Character.toUpperCase(name.charAt(i));
                modified += c;
            }
            else modified += name.charAt(i);
        }

        System.out.print("your name but it's retarded: ");
        System.out.println(modified);
        System.out.println("----------");

        System.out.print("your name but FANCY: ");
        System.out.println("++++++++++~~~~~~~~~" + name + "~~~~~~~~~~++++++++++ ");
        System.out.println("----------");

        int halfwayPoint = name.length()/2;
        System.out.print("your name but omega retarded: ");
        System.out.println(name.substring(0,halfwayPoint) +
                            "***************************************" +
                            name.substring(halfwayPoint,name.length()) );

    }
    public static void main(String[] args){
        new StringInfo();
    }

}
