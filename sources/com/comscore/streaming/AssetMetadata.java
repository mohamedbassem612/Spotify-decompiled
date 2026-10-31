package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class AssetMetadata extends CppJavaBinder {
    private long b;

    public AssetMetadata(long j) {
        this.b = j;
    }

    public long a() {
        return this.b;
    }
}
