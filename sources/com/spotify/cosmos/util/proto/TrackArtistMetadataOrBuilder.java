package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackArtistMetadataOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getLink();

    phc getLinkBytes();

    String getName();

    phc getNameBytes();

    ImageGroup getPortraits();

    boolean hasLink();

    boolean hasName();

    boolean hasPortraits();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
