package com.spotify.cosmos.util.policy.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackCollectionDecorationPolicyOrBuilder extends v2j0 {
    boolean getCanAddToCollection();

    boolean getCanBan();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsBanned();

    boolean getIsInCollection();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
