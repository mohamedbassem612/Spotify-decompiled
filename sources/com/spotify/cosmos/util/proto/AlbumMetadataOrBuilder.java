package com.spotify.cosmos.util.proto;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface AlbumMetadataOrBuilder extends v2j0 {
    AlbumArtistMetadata getArtists(int i);

    int getArtistsCount();

    List<AlbumArtistMetadata> getArtistsList();

    ImageGroup getCovers();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getLink();

    phc getLinkBytes();

    String getName();

    phc getNameBytes();

    int getYear();

    boolean hasCovers();

    boolean hasLink();

    boolean hasName();

    boolean hasYear();

    /* synthetic */ boolean isInitialized();
}
