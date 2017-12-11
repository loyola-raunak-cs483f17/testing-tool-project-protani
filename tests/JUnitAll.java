import junit.framework.*;

/**
 * Collects all test cases generated for all classes.
 */
public class JUnitAll extends TestSuite {

  public JUnitAll(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(trivia.DivByZeroTest1.class);
    suite.addTestSuite(trivia.DivByZeroTest2.class);
    suite.addTestSuite(trivia.DivByZeroTest3.class);
    suite.addTestSuite(trivia.ManyParametersTest1.class);
    suite.addTestSuite(trivia.ManyParametersTest2.class);
    suite.addTestSuite(trivia.ManyParametersTest3.class);
    suite.addTestSuite(trivia.ManyParametersTest4.class);
    suite.addTestSuite(trivia.ManyParametersTest5.class);
    suite.addTestSuite(trivia.ManyParametersTest6.class);
    suite.addTestSuite(trivia.NullDerefTest1.class);
    suite.addTestSuite(trivia.NullDerefTest2.class);
    return suite;
  }
}
