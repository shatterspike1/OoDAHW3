public class ReportCorrect implements IReport
{
    private int testCasesPassed;
    private ISubmission submission;
    
    public ReportCorrect(ISubmission theSubmission)
    {
        testCasesPassed = 0;
        submission = theSubmission;
        submission.registerReport(this);
    }
    
    public void update(boolean lastResult)
    {
        if(lastResult) {
            testCasesPassed += 1;
        }
        display();
    }
    
    public void display()
    {
        System.out.println("Test cases correct: "
            + testCasesPassed + ".");
    }
}
