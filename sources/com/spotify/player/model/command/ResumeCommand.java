package com.spotify.player.model.command;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonDeserialize
public abstract class ResumeCommand implements Command {
    public static Builder builder() {
        return new AutoValue_ResumeCommand.Builder();
    }

    public static ResumeCommand create() {
        return builder().build();
    }

    public abstract spq0 loggingParams();

    public abstract spq0 options();

    public abstract spq0 resumeOrigin();

    public abstract Builder toBuilder();
}
