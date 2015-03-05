public class SubmissionDriver
{
    public static void main(String[] args)
    {
        Submission hold;
        for(int i = 0; i <= 5; i++)
        {
            hold = new Submission();
            SingleQueue.add(hold);
            System.out.println(hold.getID());
        }
        System.out.println("Should print in same order...");
        for(int i = 0; i <= 3; i++)
        {
            System.out.println(SingleQueue.process().getID());
        }
        hold = new Submission();
        SingleQueue.add(hold);
        System.out.println("Adding:  ");
        System.out.println(hold.getID());
        System.out.println("Continuing to print Queue");
        for(int i = 0; i <= 2; i++)
        {
            System.out.println(SingleQueue.process().getID());
        }
    }
}