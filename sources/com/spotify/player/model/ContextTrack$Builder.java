package com.spotify.player.model;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class ContextTrack$Builder {
    public static ContextTrack$Builder builder() {
        return ContextTrack.builder("");
    }

    public abstract ContextTrack build();

    public abstract ContextTrack$Builder metadata(Map<String, String> map);

    public abstract ContextTrack$Builder provider(String str);

    public abstract ContextTrack$Builder uid(String str);

    public abstract ContextTrack$Builder uri(String str);
}
