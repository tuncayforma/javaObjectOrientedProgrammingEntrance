package javaThread;

public class JavaThread {
    static int i,j;
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) {
        Thread t1=new Thread()
        {
            public void run ()
            {
                for(i=0;i<=6000;i++)
                {
                    System.out.println("Fatih");
                }
            }
        };
        Thread t2=new Thread()
        {
            public void run ()
            {
                for(i=0;i<=12000;i++)
                {
                    System.out.println("Alıcı");
                }
            }
        };
        wait(1000);
        t1.start();
        t2.start();
    }
}