package javaTests.easyOnes;

public class ReverseAlphabets {
    public static void main(String[] args){
        System.out.println(reverseAlphabets(";a@b#>c?!"));
    }

    private static String reverseAlphabets(String test){
        String alphabets = "";
        //get string of alphabets

        for (int i = 0; i < test.length(); i++){
            if (test.charAt(i) >= 'a' & test.charAt(i) <= 'z'){
                alphabets += test.charAt(i);
            }
        }// "abc"
        char[] chArr = test.toCharArray();
        int j = alphabets.length() - 1;
        for (int i = 0; i < chArr.length; i++){
            if (chArr[i] >= 'a' & chArr[i] <= 'z'){
                chArr[i] = alphabets.charAt(j);
                --j;
            }
        }

        return String.valueOf(chArr);
    }
}
