package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class PauseCommand$Builder {
    public static PauseCommand$Builder builder() {
        return PauseCommand.builder();
    }

    public abstract PauseCommand build();

    public abstract PauseCommand$Builder loggingParams(LoggingParams loggingParams);

    public abstract PauseCommand$Builder options(CommandOptions commandOptions);

    public abstract PauseCommand$Builder pauseOrigin(PauseResumeOrigin pauseResumeOrigin);
}
