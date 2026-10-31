package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gg50 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public gg50(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg50)) {
            return false;
        }
        gg50 gg50Var = (gg50) obj;
        return this.a == gg50Var.a && this.b == gg50Var.b && this.c == gg50Var.c && this.d == gg50Var.d && this.e == gg50Var.e && this.f == gg50Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
}
