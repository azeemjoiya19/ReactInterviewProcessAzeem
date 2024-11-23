/*


package utils.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

        // OB: extentTestMap holds the information of thread ids and ExtentTest instances.
                ExtentReports instance created by calling getReporter() method from ExtentManager.
                At startTest() method, an instance of ExtentTest created and put into extentTestMap with current thread id.
                At endTest() method, test ends and ExtentTest instance got from extentTestMap via current thread id.
                At getTest() method, return ExtentTest instance in extentTestMap by using current thread id.
         //

public class ExtentTestManager {
    static Map extentTestMap = new HashMap();
    static ExtentReports extent = ExtentManager.getReporter();

    public static synchronized ExtentTest getTest() {
        return (ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized void endTest() {
        extent.endTest((ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId())));
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
 

     ExtentTest test = extent.startTest(testName, desc);
     extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
     

     return test;
    }

}


*/


package utils.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Manages ExtentTest instances for reporting.
 */
public class ExtentTestManager {
    private static final Map<Long, ExtentTest> extentTestMap = new ConcurrentHashMap<>();
    private static final ExtentReports extent = ExtentManager.getReporter();

    /**
     * Retrieves the ExtentTest instance associated with the current thread.
     * @return ExtentTest instance
     */
    public static synchronized ExtentTest getTest() {
        return extentTestMap.get(Thread.currentThread().getId());
    }

    /**
     * Ends the ExtentTest associated with the current thread.
     */
    public static synchronized void endTest() {
        extent.endTest(extentTestMap.get(Thread.currentThread().getId()));
    }

    /**
     * Starts a new ExtentTest with the given testName and description and associates it with the current thread.
     * @param testName Test name
     * @param desc Description of the test
     * @return ExtentTest instance
     */
    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.startTest(testName, desc);
        extentTestMap.put(Thread.currentThread().getId(), test);
        return test;
    }
}


