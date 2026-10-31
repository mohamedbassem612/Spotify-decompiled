package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class PlayCommand implements Command {
    public static Builder builder(Context context, PlayOrigin playOrigin) {
        return new AutoValue_PlayCommand.Builder().context(context).playOrigin(playOrigin);
    }

    public static PlayCommand create(Context context, PlayOrigin playOrigin) {
        return builder(context, playOrigin).build();
    }

    public abstract Context context();

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract spq0 playOptions();

    public abstract PlayOrigin playOrigin();

    public abstract Builder toBuilder();
}
