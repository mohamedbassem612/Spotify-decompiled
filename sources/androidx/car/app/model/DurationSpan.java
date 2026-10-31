package androidx.car.app.model;

import j$.time.Duration;
import java.util.Objects;
import p.pze0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static DurationSpan create(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return pze0.h(this.mDurationSeconds, "]", new StringBuilder("[seconds: "));
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
    }
}
