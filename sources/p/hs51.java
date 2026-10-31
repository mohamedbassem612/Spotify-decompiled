package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hs51 implements ns51 {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;

    public hs51(long j, long j2, String str, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs51)) {
            return false;
        }
        hs51 hs51Var = (hs51) obj;
        return this.a.equals(hs51Var.a) && this.b == hs51Var.b && this.c == hs51Var.c && this.d == hs51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
