package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.gg11;
import p.j380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class PreparePlayOptions {
    public static final PreparePlayOptions EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_PreparePlayOptions.Builder().configurationOverride(gg11.g);
    }

    public abstract spq0 alwaysPlaySomething();

    public abstract spq0 audioStream();

    public abstract j380 configurationOverride();

    public abstract spq0 initiallyPaused();

    public abstract spq0 license();

    public abstract spq0 playbackId();

    public abstract spq0 playerOptionsOverride();

    public abstract spq0 prefetchLevel();

    public abstract spq0 seekTo();

    public abstract spq0 seekToCreatorTimestamp();

    public abstract spq0 sessionId();

    public abstract spq0 skipTo();

    public abstract spq0 suppressions();

    public abstract spq0 systemInitiated();

    public abstract Builder toBuilder();
}
