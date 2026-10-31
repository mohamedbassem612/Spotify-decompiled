package j$.time.temporal;

import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(TemporalField temporalField, long j);

    Temporal b(long j, TemporalUnit temporalUnit);

    default Temporal c(long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = b(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.b(j2, temporalUnit);
    }

    /* JADX INFO: renamed from: e */
    default Temporal i(LocalDate localDate) {
        return localDate.f(this);
    }

    long until(Temporal temporal, TemporalUnit temporalUnit);
}
