package dp.singleton;

import dp.singleton.implementation.base.Singleton;
import dp.singleton.implementation.multiThreaded.ThreadSafeSingleton;
import dp.singleton.implementation.singleThreaded.NonThreadSafeSingleton;
import org.junit.Assert;
import org.junit.Test;

public class MultiThreadEnvironment {

    /***
        TODO: 4: concurrency stress testing
            - although tests can never indicate the absence of malfunctions but only their presence
            - create a pool of threads that concurrently try to obtain the instance of the thread safe or non thread safe Singleton implementation (according to the value of the 'safe' attribute)
            - each thread stores the obtained instance in a shared data structure (ex. Singleton[], each thread stores it's Singleton instance at a corresponding specific index in the array)
            - after all threads terminates, check if all the obtained Singleton instances are actually the same instance
     */



    private void multiThreadSingletonTest(boolean safe){
    }

    @Test
    public void unsafeMultiThreadSingletonTest()
    {
        multiThreadSingletonTest(false);
    }

    @Test
    public void safeMultiThreadSingletonTest()
    {
        multiThreadSingletonTest(true);
    }
}
