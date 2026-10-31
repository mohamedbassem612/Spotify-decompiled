package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class DeserializerCache implements Serializable {
    protected final LRUMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers;

    public DeserializerCache(int i) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._cachedDeserializers = new LRUMap<>(Math.min(64, i >> 2), i);
    }

    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public DeserializerCache() {
        this(2000);
    }
}
