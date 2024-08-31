package Producer_and_consumer_probelm;

public class Producer extends Thread {
    
    company c;
    public Producer(company c)
    {
        this.c=c;
    }
    public void run()
    {
       int i=1;
       while(true){
       this.c.producer_tern(i);
       try{
        Thread.sleep(1000);
       }
       catch(Exception e)
       {
       }
       i++;
       }
    }
    
}
