package dp.singleton;

import dp.singleton.implementation.base.Singleton;
import dp.singleton.implementation.singleThreaded.NonThreadSafeSingleton;
import org.junit.Assert;
import org.junit.Test;


/***
 TODO 3: single thread unit test
    - obtain two instances of the NotThreadSafeSingleton class
    - check if those objects are truly the same instance
 */
public class SingleThreadEnvironment {

 @Test
    public void singleThreadSingletonTest(){
        Singleton ob1 = NonThreadSafeSingleton.getInstance();
        Singleton ob2 = NonThreadSafeSingleton.getInstance();
        assert ob1 instanceof Singleton;
        assert ob2 instanceof Singleton;
        assert ob1 == ob2;

    }
}
