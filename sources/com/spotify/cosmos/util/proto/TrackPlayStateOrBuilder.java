package com.spotify.cosmos.util.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackPlayStateOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsPlayable();

    PlayabilityRestriction getPlayabilityRestriction();

    boolean hasIsPlayable();

    boolean hasPlayabilityRestriction();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
