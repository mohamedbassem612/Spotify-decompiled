package com.spotify.player.model.command;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.LoggingParams;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class SkipToNextTrackCommand$Builder {
    public static SkipToNextTrackCommand$Builder builder() {
        return SkipToNextTrackCommand.builder();
    }

    public abstract SkipToNextTrackCommand build();

    public abstract SkipToNextTrackCommand$Builder loggingParams(LoggingParams loggingParams);

    public abstract SkipToNextTrackCommand$Builder options(CommandOptions commandOptions);

    public abstract SkipToNextTrackCommand$Builder track(ContextTrack contextTrack);
}
