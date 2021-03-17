package com.jeroen.howtowritetests.a5extension;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;

public class ClearCacheExtension implements BeforeEachCallback {
    @Override
    public void beforeEach(ExtensionContext context) {
        CacheManager cacheManager = SpringExtension.getApplicationContext(context).getBean(CacheManager.class);
        cacheManager.getCacheNames()
                .stream()
                .map(cacheManager::getCache)
                .filter(Objects::nonNull)
                .forEach(Cache::clear);
    }
}
