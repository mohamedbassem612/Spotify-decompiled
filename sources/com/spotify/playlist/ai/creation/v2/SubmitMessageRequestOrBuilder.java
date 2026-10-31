package com.spotify.playlist.ai.creation.v2;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface SubmitMessageRequestOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    ChatMessagePreferences getMessagePreferences();

    String getMessagePrompt();

    phc getMessagePromptBytes();

    String getSessionId();

    phc getSessionIdBytes();

    boolean hasMessagePreferences();

    /* synthetic */ boolean isInitialized();
}
