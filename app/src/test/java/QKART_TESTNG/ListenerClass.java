package QKART_TESTNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

    @Override
    public void onTestStart(ITestResult result){
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "On_Test_Start", result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result){
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "On_Test_Failure", result.getName());
    }

    @Override
    public void onFinish(ITestContext context){
        QKART_Tests.takeScreenshot(QKART_Tests.driver, "On_Test_End", context.getName());
    }
}