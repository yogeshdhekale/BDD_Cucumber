package HooksPackage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AmazonHooks {

    @Before
    public void setUpBrowser(Scenario sc){
        System.out.println("Launch Chrome Browser.");
        System.out.println(sc.getName());
        System.out.println(sc.getStatus());
    }

    @Before
    public void setUpurl(){
        System.out.println("Launch app url.");
    }

    @After
    public void closeBrowser(){
        System.out.println("Close the browser.");
    }

    @After
    public void logoutApplication(){
        System.out.println("Logout from application.");
    }
   
}
