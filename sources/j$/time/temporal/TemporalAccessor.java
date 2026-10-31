package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface TemporalAccessor {
    default Object d(j$.time.d dVar) {
        if (dVar == m.a || dVar == m.b || dVar == m.c) {
            return null;
        }
        return dVar.k(this);
    }

    default int g(TemporalField temporalField) {
        o oVarK = k(temporalField);
        if (!oVarK.d()) {
            throw new n("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long j = j(temporalField);
        if (oVarK.e(j)) {
            return (int) j;
        }
        throw new DateTimeException("Invalid value for " + temporalField + " (valid values " + oVarK + "): " + j);
    }

    boolean h(TemporalField temporalField);

    long j(TemporalField temporalField);

    default o k(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.x(this);
        }
        if (h(temporalField)) {
            return ((ChronoField) temporalField).b;
        }
        throw new n(j$.time.b.a("Unsupported field: ", temporalField));
    }
}
