package Chapter2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services(){}
    public static final Map<String,Provider> providers = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(String name,Provider provider){
        regisgerProvider(DEFAULT_PROVIDER_NAME,provider);
    }
    public static void regisgerProvider(String name,Provider provider){
        providers.put(name,provider);
    }
    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if(p == null){
            throw new IllegalArgumentException("No provider register with name");
        }
        return p.newService();
    }


}
