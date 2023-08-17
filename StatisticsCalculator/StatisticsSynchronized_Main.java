/**
 * This class i have added for the test cases, I am creating 2 threads and testing my code.
 */
package StatisticsCalculator;

public class StatisticsSynchronized_Main
{
    public static void main (String[] args) throws InterruptedException
    {
        StaticsImplSynchronized staticsImplSynchronized = new StaticsImplSynchronized();

            Thread t1 = new Thread( new Runnable() {
                @Override public void run ()
                {
                    for(int i=1;i<=1000;i++) {
                        staticsImplSynchronized.event(i);
                    }
                }
            });

        Thread t2 = new Thread( new Runnable() {
            @Override public void run ()
            {
                for(int i=1;i<=1000;i++) {
                    staticsImplSynchronized.event(i);
                }
            }
        });
            t1.start();
            t2.start();
            // Here I have added joins so that t1 and t2 can complete its execution.
            t1.join();
            t2.join();
        System.out.println("Min Value is:"+ staticsImplSynchronized.minimum());
        System.out.println("Max Value is:"+ staticsImplSynchronized.maximum());
        System.out.println("Mean Value is:"+ staticsImplSynchronized.mean());
        System.out.println("Variance is:"+ staticsImplSynchronized.variance());
    }
}
