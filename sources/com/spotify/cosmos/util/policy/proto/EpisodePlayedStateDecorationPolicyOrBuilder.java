package com.spotify.cosmos.util.policy.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface EpisodePlayedStateDecorationPolicyOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsPlayed();

    boolean getLastPlayedAt();

    boolean getPlayabilityRestriction();

    boolean getPlayable();

    boolean getTimeLeft();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
