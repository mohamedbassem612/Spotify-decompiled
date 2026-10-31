package com.spotify.playlist.ai.creation.v2;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface ReportProblemRequestOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getMessageId();

    phc getMessageIdBytes();

    Problem getProblem();

    String getProblemDetail();

    phc getProblemDetailBytes();

    int getProblemValue();

    String getSessionId();

    phc getSessionIdBytes();

    /* synthetic */ boolean isInitialized();
}
