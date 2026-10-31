package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class PlaySessionCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return PlaySessionCommand.builder();
        }

        public abstract PlaySessionCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder playOptions(PlayOptions playOptions);
    }

    public static Builder builder() {
        return new AutoValue_PlaySessionCommand.Builder();
    }

    public static PlaySessionCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 playOptions();

    public abstract Builder toBuilder();
}
