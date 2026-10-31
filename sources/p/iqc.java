package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class iqc {
    public static final gqc Companion = new gqc();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ iqc(int i, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, fqc.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqc)) {
            return false;
        }
        iqc iqcVar = (iqc) obj;
        return this.a == iqcVar.a && this.b == iqcVar.b && this.c == iqcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public iqc(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
