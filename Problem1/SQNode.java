public class SQNode
{
    private Submission has = null;
    private SQNode next = null;
    
    public SQNode(Submission h, SQNode n)
    {
        has = h;
        next = n;
    }
    
    public SQNode(Submission h)
    {
        has = h;
    }
    
    public SQNode getNext()
    {
        return next;
    }
    
    public Submission getHas()
    {
        return has;
    }
    
    public void setNext(SQNode s)
    {
        next = s;
    }
    
    public void setNext()
    {
        next = null;
    }
}