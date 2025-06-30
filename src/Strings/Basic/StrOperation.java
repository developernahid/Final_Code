package Strings.Basic;
public class StrOperation {
    public static void main(String[] args){

        String str="My Name's Nahid HASAN";

        char[] charArray = {'J', 'a', 'v', 'a'};
        String str1 = new String(charArray);
        System.out.println(str1);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println("      Nahid   HASAN ".trim()+"BUBT"); //used to remove begging and ending whitespace
        System.out.println(str.length());
        System.out.println(str1.concat(" Programming"));
        System.out.println(str.contains("Nahid"));
        System.out.println(str.charAt(5));
        System.out.println(str.substring(6));
        System.out.println(str.equals(str1));
        System.out.println("Nahid".equalsIgnoreCase("NAHID")); //Equal
        System.out.println("Abc".compareTo("Bcd"));// a then b aplhabatic order hisabe comp:
        System.out.println(str.lastIndexOf('A'));
        System.out.println(str);

    }
}
