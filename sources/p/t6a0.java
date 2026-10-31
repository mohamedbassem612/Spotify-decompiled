package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t6a0 {
    public final long a;
    public long b;
    public final int c;
    public boolean d;

    public t6a0(int i, long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6a0)) {
            return false;
        }
        t6a0 t6a0Var = (t6a0) obj;
        return this.a == t6a0Var.a && this.b == t6a0Var.b && this.c == t6a0Var.c && this.d == t6a0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.f(Long.hashCode(this.a) * 31, this.b, 31), 31);
    }
}
