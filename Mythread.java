class Mythread implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {System.out.println("the number id  :"+i);
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println("finally its over");
            }
        }
    }
    public static void main(String args[])
    {
        Mythread t=new Mythread();
        Thread th=new Thread(t);
        th.start();
    }
}