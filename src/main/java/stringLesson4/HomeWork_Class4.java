package stringLesson4;

public class HomeWork_Class4 {

    public static void main(String[] args) {

        HomeWork_Class4 checkNames = new HomeWork_Class4();
        boolean result = checkNames.compareStrings("Category", "Cat");
    }

    private boolean compareStrings(String a, String b) {
        boolean result = false;

         if (a.equals(b) || b.equals(a)) {
             System.out.println("The Strings are the same");
         } else {
             System.out.println("The Strings are not the same");
            result = true;
        }
        return result;
    }
}