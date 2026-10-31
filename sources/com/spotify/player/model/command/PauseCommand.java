package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class PauseCommand implements Command {
    public static Builder builder() {
        return new AutoValue_PauseCommand.Builder();
    }

    public static PauseCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract spq0 pauseOrigin();

    public abstract Builder toBuilder();
}
