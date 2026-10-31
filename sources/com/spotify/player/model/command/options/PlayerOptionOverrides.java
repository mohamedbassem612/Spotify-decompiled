package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import p.j380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class PlayerOptionOverrides {
    public static final PlayerOptionOverrides EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_PlayerOptionOverrides.Builder().modes(Collections.EMPTY_MAP);
    }

    public abstract j380 modes();

    public abstract spq0 playbackSpeed();

    public abstract spq0 repeatingContext();

    public abstract spq0 repeatingTrack();

    public abstract spq0 shufflingContext();

    public abstract Builder toBuilder();
}
