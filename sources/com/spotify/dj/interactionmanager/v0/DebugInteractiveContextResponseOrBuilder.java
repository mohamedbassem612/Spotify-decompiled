package com.spotify.dj.interactionmanager.v0;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface DebugInteractiveContextResponseOrBuilder extends v2j0 {
    String getAckCommentary();

    phc getAckCommentaryBytes();

    boolean getContainsPromptViolation();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getIntroCommentary();

    phc getIntroCommentaryBytes();

    String getPromptViolationLabel();

    phc getPromptViolationLabelBytes();

    String getRecsplanation();

    phc getRecsplanationBytes();

    String getStatusCode();

    phc getStatusCodeBytes();

    String getStatusMessage();

    phc getStatusMessageBytes();

    String getTrackUris(int i);

    phc getTrackUrisBytes(int i);

    int getTrackUrisCount();

    List<String> getTrackUrisList();

    /* synthetic */ boolean isInitialized();
}
