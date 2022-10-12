package Strings;

public class CheckTwoStringAreAnagram {
    static boolean check(String str1,String str2)
    {
        int count=0;
        if (str1.length()!=str2.length()){
            return false;
        }
         else{
            for(int i=0;i< str1.length();i++) {
                for(int j=0;j<str2.length();j++) {
                    if(str1.charAt(i)==str2.charAt(j)) {
                        count++;
                    }
                }
            }
           if(count==str1.length() && count==str2.length())
           {
               return true;
           }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1="ABCD";
        String str2="BCDA";
        System.out.println(check(str1,str2));
        if(check(str1,str2)==true)
        {
           System.out.print("The given two strings are anagram");
        }
        else
            System.out.print("the given two stirngs are not anagram");
    }
}
