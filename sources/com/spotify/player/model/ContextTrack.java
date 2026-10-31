package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p.j380;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class ContextTrack {
    public static final String TRACK_THUMB_STATE_DOWN = "down";
    public static final String TRACK_THUMB_STATE_UP = "up";
    private static List<String> delimiters = Arrays.asList("spotify:meta:delimiter", "spotify:delimiter");

    public static Builder builder(String str) {
        return new AutoValue_ContextTrack.Builder().uri(str).uid("").metadata(Collections.EMPTY_MAP).provider("");
    }

    public static ContextTrack create(String str) {
        return builder(str).build();
    }

    public boolean isDelimiter() {
        return delimiters.contains(uri());
    }

    public abstract j380 metadata();

    public abstract String provider();

    public abstract Builder toBuilder();

    public abstract String uid();

    public abstract String uri();
}
