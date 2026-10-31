package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface EpisodeSyncStateOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getOfflineState();

    phc getOfflineStateBytes();

    int getSyncProgress();

    boolean hasOfflineState();

    boolean hasSyncProgress();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
