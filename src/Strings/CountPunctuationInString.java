package Strings;

public class CountPunctuationInString {
    public static void main(String[] args) {
        String str="Suman's Phone is locked,so please check!";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
                count++;
        }
        System.out.print("Total number of Punctuations in a string is: "+count);
    }
}
