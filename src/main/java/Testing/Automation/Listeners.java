package Testing.Automation;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners  implements ITestListener{

     public void onFinish(ITestContext arg0) {
		//TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

public void onTestFailure(ITestResult result) {
	System.out.println("onTestFailure"+result.getName());
		// TODO Auto-generated method stub
}		
	

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestSkipped"+result.getName());
		// TODO Auto-generated method stub
		
	}
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
}

}
