package com.spotify.player.model.command;

import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class ResumeCommand$Builder {
    public static ResumeCommand$Builder builder() {
        return ResumeCommand.builder();
    }

    public abstract ResumeCommand build();

    public abstract ResumeCommand$Builder loggingParams(LoggingParams loggingParams);

    public abstract ResumeCommand$Builder options(CommandOptions commandOptions);

    public abstract ResumeCommand$Builder resumeOrigin(PauseResumeOrigin pauseResumeOrigin);
}
