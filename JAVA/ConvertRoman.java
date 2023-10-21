class ConveretRoman {

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int result = convertRomanToInteger(romanNumeral);
        System.out.println(result);
    }

    public static int convertRomanToInteger(String s) {
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curValue = values[s.charAt(i) - 'A'];
            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
                prevValue = curValue;
            }
        }

        return result;
    }
}
