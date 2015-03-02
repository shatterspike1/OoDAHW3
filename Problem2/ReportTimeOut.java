public class ReportTimeOut implements IReport
{
    private int testsTimedOut;
    private ISubmission submission;
    
    public ReportTimeOut(ISubmission theSubmission)
    {
        testsTimedOut = 0;
        submission = theSubmission;
        submission.registerReport(this);
    }
    
    public void update(boolean lastResult)
    {
        if(!lastResult) {
            testsTimedOut += 1;
        }
        display();
    }
    
    public void display()
    {
        System.out.println("Test cases timed-out: "
            + testsTimedOut + ".");
    }
}

