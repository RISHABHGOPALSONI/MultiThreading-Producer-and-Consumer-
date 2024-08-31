public class Newthread extends Thread {

    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("the value of the i : "+i);
            Thread t=Thread.currentThread();
            System.out.println("the Id of the thread "+t.getId());
            try{
                Thread.sleep(1111);
            }
            catch(Exception e)
            {
            }
        }
    }
    public static void main(String args[])
    {
        Newthread th=new Newthread();
        System.out.println("the Id of the thread "+th.getId());
        System.out.println("the Id of the thread "+th.getName());

        th.start();
    }
    
}
