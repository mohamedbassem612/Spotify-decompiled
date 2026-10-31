package com.spotify.cosmos.util.proto;

import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EpisodeMetadata$MediaType$MediaTypeVerifier implements z190 {
    static final z190 INSTANCE = new EpisodeMetadata$MediaType$MediaTypeVerifier();

    private EpisodeMetadata$MediaType$MediaTypeVerifier() {
    }

    public boolean isInRange(int i) {
        return EpisodeMetadata.MediaType.forNumber(i) != null;
    }
}
