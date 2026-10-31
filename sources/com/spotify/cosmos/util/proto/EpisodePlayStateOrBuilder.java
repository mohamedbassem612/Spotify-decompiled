package com.spotify.cosmos.util.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface EpisodePlayStateOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsPlayable();

    boolean getIsPlayed();

    int getLastPlayedAt();

    PlayabilityRestriction getPlayabilityRestriction();

    int getTimeLeft();

    boolean hasIsPlayable();

    boolean hasIsPlayed();

    boolean hasLastPlayedAt();

    boolean hasPlayabilityRestriction();

    boolean hasTimeLeft();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
