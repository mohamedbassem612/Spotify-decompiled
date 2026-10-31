package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pe81 {
    public final oe81 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public pe81(oe81 oe81Var, int i, int i2, boolean z, int i3) {
        this.a = oe81Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe81)) {
            return false;
        }
        pe81 pe81Var = (pe81) obj;
        return this.a == pe81Var.a && this.b == pe81Var.b && this.c == pe81Var.c && this.d == pe81Var.d && this.e == pe81Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + xcg1.g(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
