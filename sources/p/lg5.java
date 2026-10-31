package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lg5 {
    public final boolean a;
    public final long b;
    public final long c;
    public final int d;

    public lg5(int i, long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg5)) {
            return false;
        }
        lg5 lg5Var = (lg5) obj;
        return this.a == lg5Var.a && this.b == lg5Var.b && this.c == lg5Var.c && this.d == lg5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.f(cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
