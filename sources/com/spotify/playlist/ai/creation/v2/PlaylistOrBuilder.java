package com.spotify.playlist.ai.creation.v2;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface PlaylistOrBuilder extends v2j0 {
    String getCoverArtLink();

    phc getCoverArtLinkBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getSubtitle();

    phc getSubtitleBytes();

    String getTitle();

    phc getTitleBytes();

    Item getTracks(int i);

    int getTracksCount();

    List<Item> getTracksList();

    String getUri();

    phc getUriBytes();

    /* synthetic */ boolean isInitialized();
}
