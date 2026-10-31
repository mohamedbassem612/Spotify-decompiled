package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sx50 implements ux50 {
    public final long a;
    public final long b;
    public final boolean c;

    public sx50(int i, long j, long j2) {
        this.a = (i & 1) != 0 ? 0L : j;
        this.b = j2;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx50)) {
            return false;
        }
        sx50 sx50Var = (sx50) obj;
        return this.a == sx50Var.a && this.b == sx50Var.b && this.c == sx50Var.c;
    }

    public final int hashCode() {
        return xcg1.g(cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31, this.c);
    }
}
