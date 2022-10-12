package Strings;

public class CountVowelsAndConsonentsInString {
    public static void main(String[] args) {

        String str="this a an example";
        int count1=0;
        int count2=0;
        for(int i=0;i<str.length();i++) {
            if (str.charAt(i) != ' ') {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count1++;

                } else

                    count2++;

            }
        }
        System.out.println("The vowels count in a given string is: "+count1);
        System.out.print("The consonents count in a given string is: "+count2);

    }
}
