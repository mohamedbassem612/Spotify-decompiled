package com.spotify.dj.interactionmanager.v0;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface DebugInteractiveContextRequestOrBuilder extends v2j0 {
    String getAckSystemPromptOverride();

    phc getAckSystemPromptOverrideBytes();

    String getAssistantName();

    phc getAssistantNameBytes();

    String getAssistantTags(int i);

    phc getAssistantTagsBytes(int i);

    int getAssistantTagsCount();

    List<String> getAssistantTagsList();

    String getAssistantVersion();

    phc getAssistantVersionBytes();

    /* synthetic */ s2j0 getDefaultInstanceForType();

    boolean getIgnorePromptSafetyViolation();

    String getIntroSystemPromptOverride();

    phc getIntroSystemPromptOverrideBytes();

    String getPrompt();

    phc getPromptBytes();

    boolean hasAckSystemPromptOverride();

    boolean hasIntroSystemPromptOverride();

    /* synthetic */ boolean isInitialized();
}
