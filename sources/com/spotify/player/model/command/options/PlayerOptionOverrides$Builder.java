package com.spotify.player.model.command.options;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class PlayerOptionOverrides$Builder {
    public static PlayerOptionOverrides$Builder builder() {
        return PlayerOptionOverrides.builder();
    }

    public abstract PlayerOptionOverrides build();

    public abstract PlayerOptionOverrides$Builder modes(Map<String, String> map);

    public abstract PlayerOptionOverrides$Builder playbackSpeed(Float f);

    public abstract PlayerOptionOverrides$Builder repeatingContext(Boolean bool);

    public abstract PlayerOptionOverrides$Builder repeatingTrack(Boolean bool);

    public abstract PlayerOptionOverrides$Builder shufflingContext(Boolean bool);
}
