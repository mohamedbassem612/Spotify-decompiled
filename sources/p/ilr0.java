package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ilr0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ilr0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilr0)) {
            return false;
        }
        ilr0 ilr0Var = (ilr0) obj;
        return this.a == ilr0Var.a && this.b == ilr0Var.b && this.c == ilr0Var.c && this.d == ilr0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
