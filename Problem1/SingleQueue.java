public class SingleQueue
{
    private SingleQueue sQ = null;
    private SQNode head = null;
    private SQNode tail = null;
    
    private SingleQueue(Submission s)
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
    
        if (sQ == null)
        {
            System.out.println("SingleQueue.process method ERROR: No SingleQueue exists");
            return null;
        }
        else
        {
            Submission hold = sQ.head.getHas();
            if (sQ.head.getNext() == null) // If Queue is processing last item in Queue, deletes the Queue; will reinitialize when more is added.
            {
                sQ = null;
            }
            else
            {
                sQ.head = sQ.head.getNext();
            }
        
            return hold;
        }
    }
}