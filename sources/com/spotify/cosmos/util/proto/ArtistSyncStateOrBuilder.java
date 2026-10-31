package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ArtistSyncStateOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getInferredOffline();

    phc getInferredOfflineBytes();

    String getOffline();

    phc getOfflineBytes();

    int getSyncProgress();

    boolean hasInferredOffline();

    boolean hasOffline();

    boolean hasSyncProgress();

    /* synthetic */ boolean isInitialized();
}
