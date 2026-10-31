package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@JsonFormat
public enum PlayTrigger {
    IMMEDIATELY,
    ADVANCED_PAST_TRACK,
    ADVANCED_PAST_CONTEXT
}
