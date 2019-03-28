import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FirstTest.class, LastTest.class, NoFound.class, NoFoundFirst.class })
public class AllTests {

}
