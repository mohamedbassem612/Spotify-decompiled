package com.spotify.player.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Collections;
import p.j380;
import p.spq0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonDeserialize
public abstract class ContextPage {
    public static final ContextPage EMPTY = builder().build();

    public static Builder builder() {
        return new AutoValue_ContextPage.Builder().pageUrl("").nextPageUrl("").metadata(Collections.EMPTY_MAP);
    }

    public abstract j380 metadata();

    public abstract String nextPageUrl();

    public abstract String pageUrl();

    public abstract Builder toBuilder();

    public abstract spq0 tracks();
}
