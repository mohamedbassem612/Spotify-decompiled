package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ShowPlayStateOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsPlayable();

    ShowPlayState.Label getLabel();

    String getLatestPlayedEpisodeLink();

    phc getLatestPlayedEpisodeLinkBytes();

    PlayabilityRestriction getPlayabilityRestriction();

    int getPlayedPercentage();

    long getPlayedTime();

    String getResumeEpisodeLink();

    phc getResumeEpisodeLinkBytes();

    boolean hasIsPlayable();

    boolean hasLabel();

    boolean hasLatestPlayedEpisodeLink();

    boolean hasPlayabilityRestriction();

    boolean hasPlayedPercentage();

    boolean hasPlayedTime();

    boolean hasResumeEpisodeLink();

    /* synthetic */ boolean isInitialized();
}
