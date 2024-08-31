package Producer_and_consumer_probelm;

public class Consumer extends Thread {
    company c;
    public Consumer(company c)
    {
        this.c=c;
    }

    public void run()
    {
       while(true)
       {
          this.c.consumer_tern();
          try{Thread.sleep(2000);}
          catch(Exception e){}
       }
    }
}
