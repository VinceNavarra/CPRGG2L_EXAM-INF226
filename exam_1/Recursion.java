public class recursion1 {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all detachLetters in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "vince jordan m. navarra";

        removeLetter(fullName);
        
    }
   
    static void removeLetter(String str) {
        detachLetters(str, "");
    } 
    static String detachLetters(String str, String outcome) {
        if(str.length() == 0) {
            return outcome;
        }
        char v = str.charAt(0);
        switch (v) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println(outcome + str.substring(1));
            return detachLetters(str.substring(1), outcome);
            default:
            return v + detachLetters(str.substring(1), outcome + v);
        }
    }
}
