public class Main {
    public static void main(String[] args) {

        System.out.println(SeperateDuplicatesChars("Hello"));
        System.out.println(SeperateDuplicatesChars("Bookkeeper"));
        System.out.println(SeperateDuplicatesChars("Yellowwood door"));
        System.out.println(SeperateDuplicatesChars("Chicago Cubs"));

    }

    public static String SeperateDuplicatesChars(String str)
    {
        String result = "";
        for(int i = 0; i < str.length() - 1; i ++){

            if(str.charAt(i) == str.charAt(i + 1)){
                result += str.charAt(i) + "-";
            }
            else{
                result += str.charAt(i);
            }
        }
        result += str.charAt(str.length() - 1);
        return result;

    }


}
