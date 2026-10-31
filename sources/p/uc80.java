package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uc80 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public uc80(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc80)) {
            return false;
        }
        uc80 uc80Var = (uc80) obj;
        return this.a == uc80Var.a && this.b == uc80Var.b && this.c == uc80Var.c && this.d == uc80Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
