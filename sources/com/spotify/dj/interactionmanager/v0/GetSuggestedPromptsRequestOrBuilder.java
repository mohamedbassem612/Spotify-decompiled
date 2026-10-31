package com.spotify.dj.interactionmanager.v0;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface GetSuggestedPromptsRequestOrBuilder extends v2j0 {
    String getCurrentTrackUri();

    phc getCurrentTrackUriBytes();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    Model getLlmModel();

    int getLlmModelValue();

    boolean getUnused();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
