package com.spotify.dj.interactionmanager.v0;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface GenerateAndPlayRecsRequestOrBuilder extends v2j0 {
    String getAckCommentaryText();

    phc getAckCommentaryTextBytes();

    String getCurrentSegmentId();

    phc getCurrentSegmentIdBytes();

    String getCurrentTrackUri();

    phc getCurrentTrackUriBytes();

    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getDeviceId();

    phc getDeviceIdBytes();

    String getPrompt();

    phc getPromptBytes();

    String getSessionId();

    phc getSessionIdBytes();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
