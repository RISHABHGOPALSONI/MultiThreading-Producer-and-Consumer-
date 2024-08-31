package Producer_and_consumer_probelm;

public class company {

    int n;
    boolean check=false;
    /*we assume that when checked is false then its producer tern
    when producer produces the item then it marked checked true which indicate that the product is produced
    when check is true this indicate that the item is produced then it need to consumed
    */

    synchronized public void producer_tern(int n)
    {
        if(check==true)
        {
            try{
            wait();
            }
            catch(Exception e)
            {
            }
        }
        this.n=n;
        System.out.println("the producer_tern "+n);
        check=true;
        notify();
    }

    synchronized public int consumer_tern()
    {
        if(check==false)
        {
            try{
            wait();
            }
            catch(Exception e)
            {
                
            }
        }
        System.out.println("the producer_tern "+this.n);
        check=false;
        notify();
        return this.n;
    }
    
}
