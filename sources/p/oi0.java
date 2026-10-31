package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oi0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public oi0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        return this.a == oi0Var.a && this.b == oi0Var.b && this.c == oi0Var.c && this.d == oi0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
