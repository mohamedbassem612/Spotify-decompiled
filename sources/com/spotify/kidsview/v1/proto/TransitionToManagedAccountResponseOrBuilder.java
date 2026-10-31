package com.spotify.kidsview.v1.proto;

import com.google.protobuf.Duration;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface TransitionToManagedAccountResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getMigrationId();

    phc getMigrationIdBytes();

    Duration getTimeout();

    boolean hasTimeout();

    /* synthetic */ boolean isInitialized();
}
