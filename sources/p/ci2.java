package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ci2 {
    public final int a;
    public final uh2 b;
    public final int c;
    public final int d;

    public ci2(int i, uh2 uh2Var, int i2, int i3) {
        this.a = i;
        this.b = uh2Var;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci2)) {
            return false;
        }
        ci2 ci2Var = (ci2) obj;
        return this.a == ci2Var.a && u890.j(this.b, ci2Var.b) && this.c == ci2Var.c && this.d == ci2Var.d;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        uh2 uh2Var = this.b;
        return l1d.C(this.d) + ab80.k(this.c, (iC + (uh2Var == null ? 0 : uh2Var.hashCode())) * 31, 31);
    }
}
