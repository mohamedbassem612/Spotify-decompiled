package com.spotify.campfire.datasource.impl.proto;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface TrackedShareContextOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    ListeningActivity getListeningActivity();

    ListeningStatsInteraction getListeningStatsInteraction();

    PlaylistInvitation getPlaylistInvitation();

    PlaylistMessage getPlaylistMessage();

    PlaylistReaction getPlaylistReaction();

    PlaylistReply getPlaylistReply();

    TrackedShareContext.TypeCase getTypeCase();

    boolean hasListeningActivity();

    boolean hasListeningStatsInteraction();

    boolean hasPlaylistInvitation();

    boolean hasPlaylistMessage();

    boolean hasPlaylistReaction();

    boolean hasPlaylistReply();

    /* synthetic */ boolean isInitialized();
}
