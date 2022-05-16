package com.petstore.automationtest.core.context;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@Component
public class ScenarioContext {

    private static final Map<String, Object> storage = new HashMap<>();

    public void saveData(String key, Object value) {
        storage.put(key, value);
    }

    public Object getData(String key) {
        return storage.get(key);
    }

    public void resetContext() {
        storage.clear();
    }
}
