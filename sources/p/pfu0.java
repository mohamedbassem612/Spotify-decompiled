package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pfu0 extends u4p1 {
    public final long c;
    public final long d;
    public final long e;

    public pfu0(long j, long j2, long j3) {
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfu0)) {
            return false;
        }
        pfu0 pfu0Var = (pfu0) obj;
        return this.c == pfu0Var.c && this.d == pfu0Var.d && this.e == pfu0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(Long.hashCode(this.c) * 31, this.d, 31);
    }
}
