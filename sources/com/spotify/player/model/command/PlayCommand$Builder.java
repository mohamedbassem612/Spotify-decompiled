package com.spotify.player.model.command;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class PlayCommand$Builder {
    public static PlayCommand$Builder builder() {
        return PlayCommand.builder(Context.builder("").build(), PlayOrigin.create(""));
    }

    public abstract PlayCommand build();

    public abstract PlayCommand$Builder context(Context context);

    public abstract PlayCommand$Builder loggingParams(LoggingParams loggingParams);

    public abstract PlayCommand$Builder options(PreparePlayOptions preparePlayOptions);

    public abstract PlayCommand$Builder playOptions(PlayOptions playOptions);

    public abstract PlayCommand$Builder playOrigin(PlayOrigin playOrigin);
}
