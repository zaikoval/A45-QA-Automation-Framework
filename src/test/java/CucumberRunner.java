import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/resources/features/login.feature"})

public class CucumberRunner extends AbstractTestNGCucumberTests{
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideScenarios();
    }
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}