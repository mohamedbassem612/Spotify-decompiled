package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class AddToQueueCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return AddToQueueCommand.builder(ContextTrack.create(""));
        }

        public abstract AddToQueueCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder(ContextTrack contextTrack) {
        return new AutoValue_AddToQueueCommand.Builder().track(contextTrack);
    }

    public static AddToQueueCommand create(ContextTrack contextTrack) {
        return builder(contextTrack).build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract Builder toBuilder();

    public abstract ContextTrack track();
}
