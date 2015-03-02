/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.*;

public class Submission implements ISubmission
{    
    private Random myRandom;
    private boolean lastErrorWasTimeout;
    private ArrayList reports;

    public Submission()
    {
        myRandom = new Random();
        lastErrorWasTimeout = false;
        reports = new ArrayList();
    }
    
    public void registerReport(IReport theReport)
    {
        reports.add(theReport);
    }
    
    public void removeReport(IReport theReport)
    {
        int idx = reports.indexOf(theReport);
        if(idx >= 0)
         {
            reports.remove(idx);
        }
    }
    
    public void notifyReports()
    {
        int len = reports.size();
        for(int i = 0; i < len; i++)
        {
            IReport theReport = (IReport)reports.get(i);
            theReport.update(wasTimeoutError());
        }
    }

    public void runTestCase()
    {
        // For now, randomly pass or fail, possibly due to a timeout
        boolean passed = myRandom.nextBoolean();
        if(!passed)
        {
            lastErrorWasTimeout = myRandom.nextBoolean();
        }
        
        notifyReports();
    }
    
    public boolean wasTimeoutError()
    {
        return lastErrorWasTimeout;
    }
}
