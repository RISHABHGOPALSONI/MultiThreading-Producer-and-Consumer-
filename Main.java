package Producer_and_consumer_probelm;

public class Main {
    
    public static void main(String [] args)
    {
        company c=new company();  // we have created the company class which have producer and consumer and both are synchronized
        Producer pro=new Producer(c); // it keep producing the item 
        Consumer cnr=new Consumer(c); // it keep taking the item

        pro.start();
        cnr.start();
        System.out.println("null");
    }
}
