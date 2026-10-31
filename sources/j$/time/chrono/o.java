package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class o implements j {
    public static final o AH;
    public static final /* synthetic */ o[] a;

    static {
        o oVar = new o("AH", 0);
        AH = oVar;
        a = new o[]{oVar};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? j$.time.temporal.o.f(1L, 1L) : super.k(temporalField);
    }
}
