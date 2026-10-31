package com.spotify.cosmos.util.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ArtistCollectionStateOrBuilder extends v2j0 {
    boolean getCanBan();

    String getCollectionLink();

    phc getCollectionLinkBytes();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getFollowed();

    boolean getIsBanned();

    int getNumAlbumsInCollection();

    int getNumExplicitlyLikedTracks();

    int getNumTracksInCollection();

    boolean hasCanBan();

    boolean hasCollectionLink();

    boolean hasFollowed();

    boolean hasIsBanned();

    boolean hasNumAlbumsInCollection();

    boolean hasNumExplicitlyLikedTracks();

    boolean hasNumTracksInCollection();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
