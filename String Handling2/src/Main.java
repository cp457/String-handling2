import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String s1 = "United Kingdom";
        String s2 = "Germany";

        String sub1 = s1.substring(0,6);
        String sub2 = s1.substring(7,14);

        String sub3 = sub1 + " " + s2+ " " + " " + sub2;

        char[] charArray = sub3.toUpperCase().toCharArray();
        System.out.println(charArray);



    }
}

/*
    define a string called string1 that has assigned the value "United Kingdom"
    define a string called string2 that has assigned the value "Germany"
    without using the split method:
        assign the first part of string1 before the space character (United) to sub1
        assign the second part of string after the space character (Kingdom) to sub2
        concatenate in this order sub1, string2 and sub2 into an array of chars called charArray, being sure that:
        there are spaces between the words
        all letters are uppercase
        print the charArray */
