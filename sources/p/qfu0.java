package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qfu0 extends x4p1 {
    public final long c;
    public final long d;
    public final long e;

    public qfu0(long j, long j2, long j3) {
        this.c = j;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfu0)) {
            return false;
        }
        qfu0 qfu0Var = (qfu0) obj;
        return this.c == qfu0Var.c && this.d == qfu0Var.d && this.e == qfu0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.f(Long.hashCode(this.c) * 31, this.d, 31);
    }
}
