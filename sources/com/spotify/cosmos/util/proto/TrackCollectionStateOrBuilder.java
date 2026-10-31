package com.spotify.cosmos.util.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackCollectionStateOrBuilder extends v2j0 {
    boolean getCanAddToCollection();

    boolean getCanBan();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsBanned();

    boolean getIsInCollection();

    boolean hasCanAddToCollection();

    boolean hasCanBan();

    boolean hasIsBanned();

    boolean hasIsInCollection();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
