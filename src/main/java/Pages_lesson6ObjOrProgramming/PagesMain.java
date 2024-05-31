package Pages_lesson6ObjOrProgramming;

public class PagesMain {

    public static void main(String[] args) {

//Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");

//loginScreen.pageId = 1;
//loginScreen.pageName = "Login Page";
//loginScreen.URL = "www.legionIT.com/login";

//loginScreen.openPage();
//loginScreen.clickButton("Login");
//loginScreen.closePage();
//
//
//Page aboutScreen = new Page();
//        //aboutScreen.setPageId(2);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About Page");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("Login Page");
//        loginPage.setURL(("http://..."));
//
//        loginPage.openPage();
//        loginPage.setUserName("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredentials(loginPage.getUserName(), loginPage.getPassword());

//Page page = new Page();
//page.getDeveloperName();

LoginPage loginPage = new LoginPage();
loginPage.setPageId(1);
loginPage.setPageName("page_one");

loginPage.getDeveloperName();

AboutPage aboutPage = new AboutPage();
aboutPage.getDeveloperName();

    }
}
