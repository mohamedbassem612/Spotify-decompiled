package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface j extends TemporalAccessor, j$.time.temporal.k {
    @Override // j$.time.temporal.TemporalAccessor
    default Object d(j$.time.d dVar) {
        return dVar == j$.time.temporal.m.c ? ChronoUnit.ERAS : super.d(dVar);
    }

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(ChronoField.ERA, getValue());
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? getValue() : super.g(temporalField);
    }

    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return temporalField == ChronoField.ERA;
        }
        return temporalField != null && temporalField.p(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return temporalField.K(this);
    }
}
