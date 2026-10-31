package com.spotify.player.model.command.options;

import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
final class AutoValue_TimerType_Duration extends TimerType.Duration {
    private final long durationSeconds;

    public AutoValue_TimerType_Duration(long j) {
        this.durationSeconds = j;
    }

    @Override // com.spotify.player.model.command.options.TimerType.Duration
    public long durationSeconds() {
        return this.durationSeconds;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TimerType.Duration) && this.durationSeconds == ((TimerType.Duration) obj).durationSeconds();
    }

    public int hashCode() {
        long j = this.durationSeconds;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return gvg.f(this.durationSeconds, "Duration{durationSeconds=", "}");
    }
}
