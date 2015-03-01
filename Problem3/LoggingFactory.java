public class LoggingFactory
{
    static public Logging logMake(String type)
    {
        Logging logfile = null;
        if (type.equalsIgnoreCase("text"))
        {
			logfile = new LogText();
        }
		else if (type.equalsIgnoreCase("xml"))
        {
			logfile = new LogXML();
        }
		else if (type.equalsIgnoreCase("html"))
        {
			logfile = new LogHTML();
        }
		else
        {
			logfile = new LogText();
        }
        return logfile;
    }
}
