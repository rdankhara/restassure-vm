package cityBikes;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = " @Test1",format = {"pretty","html:target/Destination"})

public class RunTest
{

}



