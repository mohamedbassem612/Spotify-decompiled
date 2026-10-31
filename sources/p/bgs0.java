package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bgs0 {
    public final dww0 a;
    public final int b;
    public final int c;
    public final hct0 d;

    public bgs0(dww0 dww0Var, int i, int i2, hct0 hct0Var) {
        this.a = dww0Var;
        this.b = i;
        this.c = i2;
        this.d = hct0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgs0)) {
            return false;
        }
        bgs0 bgs0Var = (bgs0) obj;
        return this.a.equals(bgs0Var.a) && this.b == bgs0Var.b && this.c == bgs0Var.c && this.d.equals(bgs0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
