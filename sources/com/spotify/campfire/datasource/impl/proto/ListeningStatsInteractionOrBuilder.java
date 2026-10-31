package com.spotify.campfire.datasource.impl.proto;

import com.google.type.Interval;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ListeningStatsInteractionOrBuilder extends v2j0 {
    ListeningStatsInteraction.ContentCase getContentCase();

    String getContributionUri();

    phc getContributionUriBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getReaction();

    phc getReactionBytes();

    Interval getTimeRange();

    ListeningStatsTopArtistContent getTopArtist();

    ListeningStatsTopTrackContent getTopTrack();

    boolean hasContributionUri();

    boolean hasTimeRange();

    boolean hasTopArtist();

    boolean hasTopTrack();

    /* synthetic */ boolean isInitialized();
}
