import java.util.ArrayList;
import java.util.List;

public class Arab {

    private static List<String> arab = new ArrayList<>();

    static {
        arab.add("0");
        arab.add("I");
        arab.add("II");
        arab.add("III");
        arab.add("IV");
        arab.add("V");
        arab.add("VI");
        arab.add("VII");
        arab.add("VIII");
        arab.add("IX");
        arab.add("X");
    }

    public static int toArab(String number) {
        return arab.indexOf(number);
    }

    public static String toRim(int i) {
        String r = "";
        if (i < 0) {
            r += "-";
            i = Math.abs(i);
        }
        while (i > 0) {
            if (i == 100) {
                r += "C";
                i -= 100;
            }
            if (i >= 90) {
                r += "XC";
                i -= 90;
            }
            if (i >= 50) {
                r += "L";
                i -= 50;
            }
            if (i >= 10) {
                r += "X";
                i -= 10;
                continue;
            }
            if (i == 9) {
                r += "IX";
                i -= 9;
            }
            if (i >= 5) {
                r += "V";
                i -= 5;
            }
            if (i == 4) {
                r += "IV";
                i -= 4;
            }
            if (i > 0) {
                r += "I";
                i -= 1;
            }
        }
        if (r == "") {
            r = "0";
        }
        return r;
    }
}
