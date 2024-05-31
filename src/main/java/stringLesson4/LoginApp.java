package stringLesson4;

public class LoginApp {

    public String expectedUserName = "admin";
    public String expectedPassword = "12345";

    public static void main(String[] args) {

        LoginApp loginApp = new LoginApp();
//        boolean success = loginApp.verifyUser("ADMIN", "12345");
//
//        System.out.println("Login success = " + success);

        loginApp.stringsExamples();

    }
       private boolean verifyUser(String username, String password) {
        username = username.toLowerCase();
        password = password.toLowerCase();

        boolean success = false;
        if (username == null || password == null) {
               System.out.println("Username or Password is NULL");

           } else if (username.length() == 0 || password.length() == 0) {
            System.out.println("Username or Password is empty");

        } else if (username.isBlank() || password.isBlank()) {
            System.out.println("Username or Password is blank");

        } else if (!username.equalsIgnoreCase(expectedUserName) || !password.equalsIgnoreCase(expectedPassword)) {
            System.out.println("Username or Password is does not match expected values");
        } else {
          success = true;
        }

        return success;
    }

    public void stringsExamples(){
        String txt1 = "dog";
        String txt2 = "catalog";

//        System.out.println(txt2.contains(txt1));
//        System.out.println(txt2.replace("cat", txt1));

        System.out.println(txt1.charAt(0));
        System.out.println(txt1.charAt(1));
        System.out.println(txt1.charAt(txt1.length()-1));


    }


}
