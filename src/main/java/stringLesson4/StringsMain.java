package stringLesson4;

public class StringsMain {

    public static void main(String[] args) {

        StringsMain stringsMain = new StringsMain();
        int res = stringsMain.sunOfTwoNumbers(2, 4 );
        System.out.println("The result is " + res);

        System.out.println(stringsMain.getText());
    }

    public int sunOfTwoNumbers(int num1, int num2) {

        int result = num1 + num2;
        return result;
    }

    public String getText() {
        return "blablabla";
    }

}
