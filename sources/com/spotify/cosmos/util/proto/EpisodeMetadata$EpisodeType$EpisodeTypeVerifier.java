package com.spotify.cosmos.util.proto;

import p.z190;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class EpisodeMetadata$EpisodeType$EpisodeTypeVerifier implements z190 {
    static final z190 INSTANCE = new EpisodeMetadata$EpisodeType$EpisodeTypeVerifier();

    private EpisodeMetadata$EpisodeType$EpisodeTypeVerifier() {
    }

    public boolean isInRange(int i) {
        return EpisodeMetadata.EpisodeType.forNumber(i) != null;
    }
}
