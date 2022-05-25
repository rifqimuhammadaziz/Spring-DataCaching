package rifqimuhammadaziz.springdatacaching.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HeavyService {

    @Cacheable("data")
    public String getSomeData() {
        simulateSlowProcess(); // only at first time, the next hit will get from cache
        return "Get data!";
    }

    public void simulateSlowProcess() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException exception) {
            throw new IllegalStateException(exception);
        }
    }
}
