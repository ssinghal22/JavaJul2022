package javaTests;

public class Roman {
    public static void main(String[] args){
        System.out.println(findRoman(7));
    }
    private static String findRoman(int num){
        String roman = "";
        if (num <= 3){
            for (int i = 1; i <= num; i++){
                roman += "I";
            }
        }
        if (num <= 8){
            if (num == 4){
                roman = "IV";
            }
            int diff = num - 5;
            roman = "V";
            for (int i = 1; i <= diff; i++){
                roman += "I";
            }
        }
        return roman;
    }
}
