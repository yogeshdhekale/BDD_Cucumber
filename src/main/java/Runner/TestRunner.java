package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
        @CucumberOptions(

                features = "/Users/yogeshdhekale/IdeaProjects/CucumberDemoFramework/CucumberBDDFramework/src/main/java/Features/login.feature",
                glue = "StepDefinations"

//                features = {"/Users/yogeshdhekale/IdeaProjects/CucumberDemoFramework/CucumberBDDFramework/src/main/java/Features/login.feature"},
//                glue = {"/Users/yogeshdhekale/IdeaProjects/CucumberDemoFramework/CucumberBDDFramework/src/main/java/StepDefinations/LoginStepDefination.java"}
                //format={"pretty","html:test-output"}
        )
public class TestRunner {

}
