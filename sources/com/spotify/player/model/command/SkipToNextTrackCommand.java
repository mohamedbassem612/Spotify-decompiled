package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SkipToNextTrackCommand implements Command {
    public static Builder builder() {
        return new AutoValue_SkipToNextTrackCommand.Builder();
    }

    public static SkipToNextTrackCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract Builder toBuilder();

    public abstract spq0 track();
}
