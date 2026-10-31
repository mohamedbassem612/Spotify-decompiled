package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p491 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final long d;

    public p491(int i, long j, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p491)) {
            return false;
        }
        p491 p491Var = (p491) obj;
        return this.a == p491Var.a && this.b == p491Var.b && this.c == p491Var.c && this.d == p491Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xcg1.g(ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
