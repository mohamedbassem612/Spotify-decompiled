package j$.time.temporal;

import j$.time.format.ResolverStyle;
import j$.time.format.b0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public interface TemporalField {
    default TemporalAccessor D(Map map, b0 b0Var, ResolverStyle resolverStyle) {
        return null;
    }

    long K(TemporalAccessor temporalAccessor);

    Temporal O(Temporal temporal, long j);

    boolean isDateBased();

    boolean p(TemporalAccessor temporalAccessor);

    o range();

    o x(TemporalAccessor temporalAccessor);
}
