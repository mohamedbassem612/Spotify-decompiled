package com.spotify.playlist.ai.creation.v2;

import java.util.List;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface ListSessionsResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    GetSessionResponse getSessions(int i);

    int getSessionsCount();

    List<GetSessionResponse> getSessionsList();

    /* synthetic */ boolean isInitialized();
}
