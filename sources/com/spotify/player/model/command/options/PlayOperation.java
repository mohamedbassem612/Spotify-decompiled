package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonFormat
public enum PlayOperation {
    REPLACE,
    ENQUEUE,
    PUSH
}
