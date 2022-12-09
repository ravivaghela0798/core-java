public class StringMethods {
    public static void main(String[] args) {
        String str = "Ravi ";
        String str1 = "Vaghela";
        String s = "Tevh";
        System.out.println("String : " + str);
        System.out.println("length() : " + str.length());
        System.out.println("charAt(int i) : " + str.charAt(3));
        System.out.println("subString(int i) : " + str.substring(3));
        System.out.println("subString(int i, int i) : " + str.substring(0, 3));
        System.out.println("concate(String s) : " + str.concat(str1));
        System.out.println("int indexOf(String s) : " + str.indexOf("i "));
        System.out.println("int indexOf(String s, int i) : " + str.indexOf("avi", 0));
        System.out.println("Int lastIndexOf(String s) : " + str.lastIndexOf("v"));
        System.out.println("boolean equals(Object obj) : " + str.equals(str1));
        System.out.println("boolean equalIgnoreCase(Object obj) : " + str.equalsIgnoreCase(str1));
        System.out.println("int compareTo(String anotherString) : " + str.compareTo(str1));
        System.out.println("int compareToIngoreCase(String anotherString) : " + str.compareToIgnoreCase(str1));
        System.out.println("String toLowerCase() : " + str.toLowerCase());
        System.out.println("String toUpperCase() : " + str.toUpperCase());
        System.out.println("String trim() : " + str.trim());
        System.out.println("String replace(char oldChar, char newChar) : " + s.replace("v", "c"));
    }
}
