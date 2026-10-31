package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SetRepeatingContextCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SetRepeatingContextCommand.builder(false);
        }

        public abstract SetRepeatingContextCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder value(boolean z);
    }

    public static Builder builder(boolean z) {
        return new AutoValue_SetRepeatingContextCommand.Builder().value(z);
    }

    public static SetRepeatingContextCommand create(boolean z) {
        return builder(z).build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract Builder toBuilder();

    public abstract boolean value();
}
