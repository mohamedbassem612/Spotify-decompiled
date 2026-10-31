package com.fasterxml.jackson.databind.util;

import com.comscore.streaming.AdvertisementType;
import com.fasterxml.jackson.databind.PropertyName;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class RootNameLookup implements Serializable {
    protected transient LRUMap<Object, PropertyName> _rootNames = new LRUMap<>(20, AdvertisementType.OTHER);

    public Object readResolve() {
        return new RootNameLookup();
    }
}
