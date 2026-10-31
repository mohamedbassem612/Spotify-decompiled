package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonFormat
public enum BitrateStrategy {
    UNKNOWN,
    BEST_MATCHING,
    BACKEND_ADVISED,
    OFFLINED_FILE,
    CACHED_FILE,
    LOCAL_FILE
}
