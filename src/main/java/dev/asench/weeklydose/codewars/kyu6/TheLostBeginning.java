package dev.asench.weeklydose.codewars.kyu6;

public class TheLostBeginning {

    public static final Integer SMALLEST_NUMBER = 1;

    public static long beginning(String s) {

        for (int i = SMALLEST_NUMBER; i <= s.length(); i++) {
            var firstValue = Integer.parseInt(s.substring(0, i));
            var standard = new StringBuilder();
            for (var j = firstValue; standard.length() < s.length(); j++) {
                standard.append(j);
            }

            if (standard.toString().equals(s))
                return firstValue;
        }

        return Integer.parseInt(s);
    }

}
