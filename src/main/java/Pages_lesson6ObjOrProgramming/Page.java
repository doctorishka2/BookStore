package Pages_lesson6ObjOrProgramming;

import org.openqa.selenium.json.JsonOutput;

public class Page {

private int pageId = 54;
private String pageName;
private String URL;

    public Page() {

    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

//    private String pageName;
//private int pageId;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

   // private String URL;

//Constructor 1
//public Page(String pageName, int pageId, String URL){
//    this.pageName = pageName;
//    this.pageId = pageId;
//    this.URL = URL;
//}

//Get method pageId
public int getPageId(){
    return pageId;
}

//Set method pageId
public void setPageId(int pageId){
    this.pageId = pageId;
}


public void openPage(){
    System.out.println(String.format("Page %s was opened", pageName));
}

//public void closePage(){
//        System.out.println(String.format("Page %s was closed", pageName));
//}

public void clickButton(String buttonName){

    System.out.println(String.format("button %s was clicked", buttonName));

}
   // public abstract void getDeveloperName();


}

