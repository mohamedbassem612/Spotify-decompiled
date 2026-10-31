package com.spotify.campfire.datasource.impl.proto;

import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public interface ClientEventCaptureOrBuilder extends v2j0 {
    AgentContext getAgentContext();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    EventCapture getEventCapture();

    String getInitUsername();

    phc getInitUsernameBytes();

    boolean hasAgentContext();

    boolean hasEventCapture();

    /* synthetic */ boolean isInitialized();
}
