package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.Map;
import p.gg11;
import p.j380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SetOptionsCommand implements Command {

    public static abstract class Builder {
        public static Builder builder() {
            return SetOptionsCommand.builder();
        }

        public abstract SetOptionsCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder modes(Map<String, String> map);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder playbackSpeed(float f);

        public abstract Builder repeatingContext(boolean z);

        public abstract Builder repeatingTrack(boolean z);

        public abstract Builder shufflingContext(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_SetOptionsCommand.Builder().modes(gg11.g);
    }

    public static SetOptionsCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract j380 modes();

    public abstract spq0 options();

    public abstract spq0 playbackSpeed();

    public abstract spq0 repeatingContext();

    public abstract spq0 repeatingTrack();

    public abstract spq0 shufflingContext();

    public abstract Builder toBuilder();
}
