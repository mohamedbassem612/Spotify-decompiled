package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import p.gg11;
import p.j380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class PlayerOptions {
    public static final PlayerOptions EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerOptions.builder();
        }

        public abstract PlayerOptions build();

        public abstract Builder modes(Map<String, String> map);

        public abstract Builder playbackSpeed(float f);

        public abstract Builder repeatingContext(boolean z);

        public abstract Builder repeatingTrack(boolean z);

        public abstract Builder shufflingContext(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_PlayerOptions.Builder().shufflingContext(false).repeatingContext(false).repeatingTrack(false).modes(gg11.g);
    }

    public abstract j380 modes();

    public abstract spq0 playbackSpeed();

    public abstract boolean repeatingContext();

    public abstract boolean repeatingTrack();

    public abstract boolean shufflingContext();

    public abstract Builder toBuilder();
}
