package com.spotify.cosmos.util.policy.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface ArtistCollectionDecorationPolicyOrBuilder extends v2j0 {
    boolean getCanBan();

    boolean getCollectionLink();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIsBanned();

    boolean getIsFollowed();

    boolean getNumAlbumsInCollection();

    boolean getNumExplicitlyLikedTracks();

    boolean getNumTracksInCollection();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
