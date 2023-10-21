class Pangram {

    public static void main(String[] args) {
        String sentence = "abc def ghi jklm no p qrstuvwx yz";
        boolean isPangram = isPangram(sentence.toLowerCase());
        System.out.println(isPangram);
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
