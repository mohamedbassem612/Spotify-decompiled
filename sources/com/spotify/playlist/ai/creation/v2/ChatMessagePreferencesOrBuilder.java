package com.spotify.playlist.ai.creation.v2;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface ChatMessagePreferencesOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getExcludedUris(int i);

    phc getExcludedUrisBytes(int i);

    int getExcludedUrisCount();

    List<String> getExcludedUrisList();

    String getIncludedUris(int i);

    phc getIncludedUrisBytes(int i);

    int getIncludedUrisCount();

    List<String> getIncludedUrisList();

    /* synthetic */ boolean isInitialized();
}
