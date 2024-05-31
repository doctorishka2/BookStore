package Pages_lesson6ObjOrProgramming;

public class LoginPage extends Page implements PageInterface {

    //Variables
    private String userName;
    private String password;
    //private int pageId = 22;

    public void populateCredentials(String userName, String password){
        System.out.println(String.format("Credentials are populated: %s, %s", userName, password));
    }

//Get password
    public String getPassword() {
        return password;
    }
//Set password
    public void setPassword(String password) {
        this.password = password;
    }

//Get userName
    public String getUserName() {
        return userName;
    }
//Set userName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void getDeveloperName(){
        System.out.println("John Smith");
    }



}
