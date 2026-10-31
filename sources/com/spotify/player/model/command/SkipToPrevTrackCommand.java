package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SkipToPrevTrackCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SkipToPrevTrackCommand.builder();
        }

        public abstract SkipToPrevTrackCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(SkipToPrevTrackOptions skipToPrevTrackOptions);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new AutoValue_SkipToPrevTrackCommand.Builder();
    }

    public static SkipToPrevTrackCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract Builder toBuilder();

    public abstract spq0 track();
}
