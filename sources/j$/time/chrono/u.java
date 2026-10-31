package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class u implements j, Serializable {
    public static final u d;
    public static final u[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        u uVar = new u(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = uVar;
        e = new u[]{uVar, new u(0, LocalDate.of(1912, 7, 30), "Taisho"), new u(1, LocalDate.of(1926, 12, 25), "Showa"), new u(2, LocalDate.of(1989, 1, 8), "Heisei"), new u(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    public u(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static u m(LocalDate localDate) {
        if (localDate.isBefore(t.d)) {
            j$.nio.file.r.h("JapaneseDate before Meiji 6 are not supported");
            return null;
        }
        for (int length = e.length - 1; length >= 0; length--) {
            u uVar = e[length];
            if (localDate.compareTo((ChronoLocalDate) uVar.b) >= 0) {
                return uVar;
            }
        }
        return null;
    }

    public static u o(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            u[] uVarArr = e;
            if (i2 < uVarArr.length) {
                return uVarArr[i2];
            }
        }
        j$.nio.file.r.b("Invalid era: ", i);
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a0((byte) 5, this);
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o k(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? r.c.w(chronoField) : super.k(temporalField);
    }

    public final u n() {
        u[] uVarArr = e;
        if (this == uVarArr[uVarArr.length - 1]) {
            return null;
        }
        return o(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
