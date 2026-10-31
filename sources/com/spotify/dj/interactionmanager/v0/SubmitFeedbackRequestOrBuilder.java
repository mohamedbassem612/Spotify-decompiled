package com.spotify.dj.interactionmanager.v0;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface SubmitFeedbackRequestOrBuilder extends v2j0 {
    @Override // p.v2j0
    /* synthetic */ s2j0 getDefaultInstanceForType();

    Problem getProblem();

    String getProblemDetail();

    phc getProblemDetailBytes();

    int getProblemValue();

    @Override // p.v2j0
    /* synthetic */ boolean isInitialized();
}
