package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class CommandOptions {
    public static final CommandOptions EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_CommandOptions.Builder();
    }

    public abstract spq0 onlyForLocalDevice();

    public abstract spq0 onlyForPlaybackId();

    public abstract spq0 overrideRestrictions();

    public abstract spq0 systemInitiated();

    public abstract Builder toBuilder();
}
