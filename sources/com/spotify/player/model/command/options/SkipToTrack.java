package com.spotify.player.model.command.options;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class SkipToTrack {
    public static final SkipToTrack EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_SkipToTrack.Builder();
    }

    public static SkipToTrack fromIndices(Long l, Long l2) {
        return builder().trackIndex(l).pageIndex(l2).build();
    }

    public static SkipToTrack fromUid(String str) {
        return builder().trackUid(str).build();
    }

    public static SkipToTrack fromUri(String str) {
        return builder().trackUri(str).build();
    }

    public abstract spq0 pageIndex();

    public abstract spq0 pageUrl();

    public abstract Builder toBuilder();

    public abstract spq0 trackIndex();

    public abstract spq0 trackUid();

    public abstract spq0 trackUri();
}
