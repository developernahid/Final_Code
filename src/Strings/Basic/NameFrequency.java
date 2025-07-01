package Strings.Basic;
import java.util.*;
public class NameFrequency {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String name= input.nextLine();
        name= name.toLowerCase();
        String[] nameStr= name.split(" ");

        List<String > nameList= Arrays.asList(nameStr);
        Map<String,Integer> mp= new HashMap<>();

        for (String str:nameStr){
            if (mp.containsKey(str)){
                mp.put(str,mp.get(str)+1);
            }
            else {
                mp.put(str,1);
            }
        }

        for (String k: mp.keySet()){
            System.out.println(k +" freequency: "+mp.get(k));
        }
    }
}
