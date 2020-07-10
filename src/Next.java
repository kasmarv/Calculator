public class Next {
    public static void next(String firstString, String sign, String secondString) {
        boolean numberType = true; // Если true - арабские, false - римские
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        try {
            if (!(sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*"))) {
                throw new Exception("e2");
            }
        } catch (Exception e2) {
            System.out.println("Неверный знак");
            System.exit(0);
        }
        try {
            firstNumber = Integer.parseInt(firstString);
            secondNumber = Integer.parseInt(secondString);
        } catch (Exception e) {
            try {
                firstNumber = Arab.toArab(firstString);
                secondNumber = Arab.toArab(secondString);
                numberType = false;
            } catch (Exception e1) {
                System.out.println("Неверный ввод");
                System.exit(0);
            }
        }
        if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10) {
            System.out.println("Неверный диапазон");
            System.exit(0);
        }
        if (sign.equals("-")) {
            result = Count.sub(firstNumber, secondNumber);
        } else if (sign.equals("+")) {
            result = Count.add(firstNumber, secondNumber);
        } else if (sign.equals("*")) {
            result = Count.mul(firstNumber, secondNumber);
        } else if (sign.equals("/")) {
            result = Count.div(firstNumber, secondNumber);
        }
        if (numberType == false) {
            System.out.println(Arab.toRim(result));
        } else {
            System.out.println(result);
        }
    }
}
