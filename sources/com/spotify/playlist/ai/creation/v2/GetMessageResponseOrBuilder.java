package com.spotify.playlist.ai.creation.v2;

import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface GetMessageResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    ChatMessagePreferences getMessagePreferences();

    Playlist getPlaylist();

    int getRetryAfterMs();

    Status getStatus();

    long getSubmitTimestampMs();

    boolean hasMessagePreferences();

    boolean hasPlaylist();

    boolean hasStatus();

    /* synthetic */ boolean isInitialized();
}
