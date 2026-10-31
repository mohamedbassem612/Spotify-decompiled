package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface TemporalUnit {
    long between(Temporal temporal, Temporal temporal2);

    Duration getDuration();

    boolean isDurationEstimated();

    Temporal p(Temporal temporal, long j);
}
