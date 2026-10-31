package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class p extends j {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final ChronoLocalDate g;

    public p(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(temporalField, i, i2, c0.NOT_NEGATIVE, i3);
        this.g = chronoLocalDate;
    }

    @Override // j$.time.format.j
    public final long a(w wVar, long j) {
        long jAbs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.g;
        long jG = chronoLocalDate != null ? Chronology.n(wVar.a).E(chronoLocalDate).g(this.a) : 0;
        long[] jArr = j.f;
        if (j >= jG) {
            long j2 = jArr[this.b];
            if (j < jG + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.j
    public final int c(final v vVar, long j, final int i, final int i2) {
        final p pVar;
        v vVar2;
        final long j2;
        int iG;
        long j3;
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            iG = vVar.d().E(chronoLocalDate).g(this.a);
            pVar = this;
            j2 = j;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.c(vVar, j2, i, i2);
                }
            };
            vVar2 = vVar;
            ArrayList arrayList = vVar2.e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                vVar2.e = arrayList;
            }
            arrayList.add(consumer);
        } else {
            pVar = this;
            vVar2 = vVar;
            j2 = j;
            iG = 0;
        }
        int i3 = i2 - i;
        int i4 = pVar.b;
        if (i3 != i4 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = j.f[i4];
            long j5 = iG;
            long j6 = j5 - (j5 % j4);
            long j7 = iG > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.g(pVar.a, j3, i, i2);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new p(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        ChronoLocalDate chronoLocalDate = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (chronoLocalDate != null ? chronoLocalDate : 0) + ")";
    }
}
