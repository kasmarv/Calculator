import java.util.ArrayList;
import java.util.List;

public class Arab {

    private final static List<String> arab = new ArrayList<>();

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
        StringBuilder r = new StringBuilder();
        if (i < 0) {
            r.append("-");
            i = Math.abs(i);
        }
        while (i > 0) {
            if (i == 100) {
                r.append("C");
                i -= 100;
            }
            if (i >= 90) {
                r.append("XC");
                i -= 90;
            }
            if (i >= 50) {
                r.append("L");
                i -= 50;
            }
            if (i >= 10) {
                r.append("X");
                i -= 10;
                continue;
            }
            if (i == 9) {
                r.append("IX");
                i -= 9;
            }
            if (i >= 5) {
                r.append("V");
                i -= 5;
            }
            if (i == 4) {
                r.append("IV");
                i -= 4;
            }
            if (i > 0) {
                r.append("I");
                i -= 1;
            }
        }
        if (r.toString().equals("")) {
            r = new StringBuilder("0");
        }
        return r.toString();
    }
}
