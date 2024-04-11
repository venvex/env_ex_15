package dp.singleton.implementation.base;

import java.time.LocalDateTime;

public abstract class Singleton {

    private String instanceTag;
    private LocalDateTime instantiationTimestamp;

    public Singleton(String instanceTag)
    {
        this.instanceTag = instanceTag;
        this.instantiationTimestamp = LocalDateTime.now();
    }


    public String getInstanceTag() {
        return instanceTag;
    }
    public LocalDateTime getInstantiationTimestamp() {
        return instantiationTimestamp;
    }



}
