package com.spotify.playlist.ai.creation.v2;

import java.util.List;
import p.phc;
import p.s2j0;
import p.v2j0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public interface CreateSessionResponseOrBuilder extends v2j0 {
    /* synthetic */ s2j0 getDefaultInstanceForType();

    String getPopularPrompts(int i);

    phc getPopularPromptsBytes(int i);

    int getPopularPromptsCount();

    List<String> getPopularPromptsList();

    String getSessionId();

    phc getSessionIdBytes();

    String getSuggestedPrompts(int i);

    phc getSuggestedPromptsBytes(int i);

    int getSuggestedPromptsCount();

    List<String> getSuggestedPromptsList();

    /* synthetic */ boolean isInitialized();
}
