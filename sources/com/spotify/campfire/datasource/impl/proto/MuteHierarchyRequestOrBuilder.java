package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.Duration;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface MuteHierarchyRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    Duration getDuration();

    String getHierarchyId();

    phc getHierarchyIdBytes();

    boolean hasDuration();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
