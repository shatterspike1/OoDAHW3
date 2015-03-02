public interface ISubmission 
{
    public void registerReport(IReport theReport);
    public void removeReport(IReport theReport);
    public void notifyReports();
}
