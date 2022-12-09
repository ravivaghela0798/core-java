/*
 * programs of all the string methods
 */

public class StringMethods {

    public static void main(String[] args) {
        String firstName = "Ravi ";
        String lastName = "Vaghela";
        String wordString = "Tevh";

        // print firstName string
        System.out.println("String : " + firstName);
        // print length of firstName String
        System.out.println("length() : " + firstName.length());
        // print third index character of firstName String
        System.out.println("charAt(int i) : " + firstName.charAt(3));
        // print firstName String that start on character index third
        System.out.println("subString(int i) : " + firstName.substring(3));
        // print firstName String that start on character index 0 and end on third index
        System.out.println("subString(int i, int i) : " + firstName.substring(0, 3));
        // print concate lasteName String to firstName String
        System.out.println("concate(String s) : " + firstName.concat(lastName));
        // print i charater index in firstName String
        System.out.println("int indexOf(String s) : " + firstName.indexOf("i "));
        // print index of string that start on
        System.out.println("int indexOf(String s, int i) : " + firstName.indexOf("avi", 0));
        // print last index of character
        System.out.println("Int lastIndexOf(String s) : " + firstName.lastIndexOf("v"));
        // print true/false to compare with case sensetive firstName String to lastName String
        System.out.println("boolean equals(Object obj) : " + firstName.equals(lastName));
        // print true/false to compare without case sensetive firstName String to firstName String
        System.out.println("boolean equalIgnoreCase(Object obj) : " + firstName.equalsIgnoreCase(lastName));
        // print int value to compare with case sensetive firtsName String to lastName String
        System.out.println("int compareTo(String anotherString) : " + firstName.compareTo(lastName));
        // print int value to compare without case sensetive firtsName String to lastName String
        System.out.println("int compareToIngoreCase(String anotherString) : " + firstName.compareToIgnoreCase(lastName));
        // print lower case firstName String
        System.out.println("String toLowerCase() : " + firstName.toLowerCase());
        // print upper case firstName String
        System.out.println("String toUpperCase() : " + firstName.toUpperCase());
        // print trimmed(remove whitespace from start and end) firstName String
        System.out.println("String trim() : " + firstName.trim());
        // print wordString to replacable charater
        System.out.println("String replace(char oldChar, char newChar) : " + wordString.replace("v", "c"));
    }

}
