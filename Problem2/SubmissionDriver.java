public class SubmissionDriver
{
    public static void main(String[] args)
    {
        Submission dummySubmission = new Submission();
        ReportCorrect repCorrect = new ReportCorrect(dummySubmission);
        ReportTimeOut repTimeOut = new ReportTimeOut(dummySubmission);
        
        for(int i = 0; i < 15; i++)
        {
            dummySubmission.runTestCase();
        }
    }
}
