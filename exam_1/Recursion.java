public class Recursion {
    public static void main(String[] args) {
        String fullName = "vince jordan m. navarra";
        System.out.println(removeLetter(fullName));
    }

    static String removeLetter(String str) {
        if (str.isEmpty()) {
            return "";
        }
        
        String vowels = "aeiou";
        char firstChar = str.charAt(0);
        String lastName = str.substring(str.lastIndexOf(" ") + 1);
        char lastLetter = lastName.charAt(lastName.length() - 1);
        boolean isVowel = vowels.indexOf(lastLetter) != -1;

        if ((isVowel && vowels.indexOf(firstChar) != -1) || (!isVowel && vowels.indexOf(firstChar) == -1)) {
            return removeLetter(str.substring(1));
        } else {
            return str.charAt(0) + removeLetter(str.substring(1));
        }
    }
}
