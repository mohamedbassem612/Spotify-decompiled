package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pkk1 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public pkk1(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkk1)) {
            return false;
        }
        pkk1 pkk1Var = (pkk1) obj;
        return this.a == pkk1Var.a && this.b == pkk1Var.b && this.c == pkk1Var.c && this.d == pkk1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
