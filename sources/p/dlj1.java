package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dlj1 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;

    public dlj1(long j, long j2, String str, int i) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlj1)) {
            return false;
        }
        dlj1 dlj1Var = (dlj1) obj;
        return this.a.equals(dlj1Var.a) && this.b == dlj1Var.b && this.c == dlj1Var.c && this.d == dlj1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(ab80.k(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}
