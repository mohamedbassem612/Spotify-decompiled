package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ph2 extends sh2 {
    public final int a;
    public final int b;
    public final int c;
    public final d0p1 d;

    public ph2(int i, int i2, int i3, d0p1 d0p1Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = d0p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph2)) {
            return false;
        }
        ph2 ph2Var = (ph2) obj;
        return this.a == ph2Var.a && this.b == ph2Var.b && this.c == ph2Var.c && this.d.equals(ph2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }
}
