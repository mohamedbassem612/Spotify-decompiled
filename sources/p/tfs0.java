package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tfs0 {
    public final rfs0 a;
    public final int b;
    public final lny0 c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public tfs0(rfs0 rfs0Var, int i, lny0 lny0Var, String str, boolean z, boolean z2) {
        this.a = rfs0Var;
        this.b = i;
        this.c = lny0Var;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfs0)) {
            return false;
        }
        tfs0 tfs0Var = (tfs0) obj;
        return this.a.equals(tfs0Var.a) && this.b == tfs0Var.b && u890.j(this.c, tfs0Var.c) && u890.j(this.d, tfs0Var.d) && this.e == tfs0Var.e && this.f == tfs0Var.f;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        lny0 lny0Var = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(cy30.d((iK + (lny0Var == null ? 0 : lny0Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }
}
