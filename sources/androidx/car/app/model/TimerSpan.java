package androidx.car.app.model;

import p.cy30;
import p.pze0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class TimerSpan extends CarSpan {
    private static final long TWENTY_YEARS_IN_MS = 630720000000L;
    private final long mElapsedRealtimeMillis;

    private TimerSpan() {
        this.mElapsedRealtimeMillis = 0L;
    }

    public static TimerSpan create(long j) {
        long j2 = TWENTY_YEARS_IN_MS;
        if (j <= j2) {
            return new TimerSpan(j);
        }
        StringBuilder sbS = cy30.s(j, "The given start time [", "] cannot be larger than ");
        sbS.append(j2);
        throw new IllegalArgumentException(sbS.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimerSpan) && this.mElapsedRealtimeMillis == ((TimerSpan) obj).mElapsedRealtimeMillis;
    }

    public long getElapsedRealtimeMillis() {
        return this.mElapsedRealtimeMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.mElapsedRealtimeMillis);
    }

    public String toString() {
        return pze0.h(this.mElapsedRealtimeMillis, "]", new StringBuilder("[start: "));
    }

    private TimerSpan(long j) {
        this.mElapsedRealtimeMillis = j;
    }
}
