package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zpf1 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;

    public zpf1(int i, long j, long j2, long j3) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpf1)) {
            return false;
        }
        zpf1 zpf1Var = (zpf1) obj;
        return this.a == zpf1Var.a && this.b == zpf1Var.b && this.c == zpf1Var.c && this.d == zpf1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.f(l1d.C(this.a) * 31, this.b, 31), this.c, 31);
    }
}
