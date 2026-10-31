package com.spotify.cosmos.util.policy.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ShowPlayedStateDecorationPolicyOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsPlayable();

    boolean getLabel();

    boolean getLatestPlayedEpisodeLink();

    boolean getPlayabilityRestriction();

    boolean getPlayedTime();

    boolean getResumeEpisodeLink();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
