package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import p.b380;
import p.bg11;
import p.spq0;
import p.w280;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class PlayerQueue {
    public static final PlayerQueue EMPTY = builder().build();

    public static abstract class Builder {
        public static Builder builder() {
            return PlayerQueue.builder();
        }

        public abstract PlayerQueue build();

        public Builder nextTracks(List<ContextTrack> list) {
            return nextTracks(b380.p(list));
        }

        public abstract Builder nextTracks(b380 b380Var);

        public Builder prevTracks(List<ContextTrack> list) {
            return prevTracks(b380.p(list));
        }

        public abstract Builder prevTracks(b380 b380Var);

        public abstract Builder revision(String str);

        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        Builder builderRevision = new AutoValue_PlayerQueue.Builder().revision("");
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        return builderRevision.nextTracks((b380) bg11Var).prevTracks((b380) bg11Var);
    }

    public abstract b380 nextTracks();

    public abstract b380 prevTracks();

    public abstract String revision();

    public abstract Builder toBuilder();

    public abstract spq0 track();
}
