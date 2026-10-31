package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.TimerType;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class SetSleepTimerCommand implements Command {
    public static final String ENDPOINT_NAME = "set_sleep_timer";

    public static abstract class Builder {
        public static Builder builder() {
            return SetSleepTimerCommand.builder(TimerType.endOfTrack());
        }

        public abstract SetSleepTimerCommand build();

        public abstract Builder loggingParams(LoggingParams loggingParams);

        public abstract Builder options(CommandOptions commandOptions);

        public abstract Builder timerType(TimerType timerType);
    }

    public static Builder builder(TimerType timerType) {
        return new AutoValue_SetSleepTimerCommand.Builder().timerType(timerType);
    }

    public static SetSleepTimerCommand create(TimerType timerType) {
        return builder(timerType).build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract TimerType timerType();

    public abstract Builder toBuilder();
}
