public class SingleQueue
{
    private SingleQueue sQ = null;
    private SQNode head = null;
    private SQNode tail = null;
    
    public SingleQueue(Submission s)
    {
        head = new SQNode(s);
        tail = head;
    }
    
    public void add(Submission s)
    {
        if (sQ == null)
        {
            sQ = new SingleQueue(s);
        }
        
        else
        {
            sQ.tail.setNext(new SQNode(s));
            sQ.tail = sQ.tail.getNext();
        }
    }
    
    public Submission process()
    {
        Submission hold = sQ.head.getHas();
        
        sQ.head = sQ.head.getNext();
        
        return hold;
    }
}