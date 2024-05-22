package dp.singleton.implementation.multiThreaded;

import dp.singleton.implementation.base.Singleton;
import dp.singleton.implementation.singleThreaded.NonThreadSafeSingleton;


/***
 TODO 2.0:  thread safe Singleton - implementation
    - identify the areas, within the non thread safe Singleton implementation, that are not safe for concurrent execution.
    - using multithreading mechanisms, provide a thread safe implementation
    *** OPTIONAL: during implementation, efficiency aspects should be consider
 */


public class ThreadSafeSingleton  extends Singleton {


    /***
     TODO 2.1:
        - Declare and initialize all the instance or class variables that are strictly needed for the Singleton pattern implementation
     */
    private static ThreadSafeSingleton threadSafeInstance = null;

    /***
     TODO 2.2: class constructor
         - Set the appropriate access modifier for the constructor.
         - Directly calling the constructor should be possible only from within the class definition.
     */
    private ThreadSafeSingleton()
    {
        super("threadSafe");
    }



    /***
     TODO 2.3: method area
         - Declare and define all the instance or class methods that are required for the Singleton pattern implementation
     */
    public static ThreadSafeSingleton getInstance ()
    {
        if(threadSafeInstance==null)
        {
            threadSafeInstance = new ThreadSafeSingleton();
        }
        return threadSafeInstance;

    }

}
