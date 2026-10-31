package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@JsonFormat
public enum BitrateLevel {
    UNKNOWN,
    LOW,
    NORMAL,
    HIGH,
    VERY_HIGH,
    HIFI,
    HIFI_24
}
