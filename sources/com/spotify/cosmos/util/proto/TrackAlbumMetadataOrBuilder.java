package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface TrackAlbumMetadataOrBuilder extends v2j0 {
    TrackAlbumArtistMetadata getArtist();

    ImageGroup getCovers();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getLink();

    phc getLinkBytes();

    String getName();

    phc getNameBytes();

    boolean hasArtist();

    boolean hasCovers();

    boolean hasLink();

    boolean hasName();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
