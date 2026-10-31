package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.hr80;
import p.spq0;
import p.t380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class LoggingParams {
    public static final LoggingParams EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_LoggingParams.Builder();
    }

    public abstract spq0 commandId();

    public abstract spq0 commandInitiatedTime();

    public abstract spq0 commandReceivedTime();

    public spq0 interactionId() {
        return spq0.a((String) hr80.s(interactionIds()));
    }

    public abstract t380 interactionIds();

    public spq0 pageInstanceId() {
        return spq0.a((String) hr80.s(pageInstanceIds()));
    }

    public abstract t380 pageInstanceIds();

    public abstract Builder toBuilder();
}
