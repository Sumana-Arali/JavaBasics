package Strings;
import java.util.*;

public class CountTotalNumberOfCharactersInString {
    public static void main(String[] args) {
        String s="Count the Character in string";
        int count=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                count++;
        }
        System.out.print("Total number of charecter in a given string excluding spaces is: "+count);
    }
}
