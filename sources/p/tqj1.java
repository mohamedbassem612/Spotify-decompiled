package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tqj1 {
    public final int a;
    public final f2k1 b;
    public final String c;
    public final z1u0 d;

    public tqj1(int i, f2k1 f2k1Var, String str, z1u0 z1u0Var) {
        this.a = i;
        this.b = f2k1Var;
        this.c = str;
        this.d = z1u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqj1)) {
            return false;
        }
        tqj1 tqj1Var = (tqj1) obj;
        return this.a == tqj1Var.a && this.b.equals(tqj1Var.b) && this.c.equals(tqj1Var.c) && u890.j(this.d, tqj1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b.a), 31, this.c);
        z1u0 z1u0Var = this.d;
        return iD + (z1u0Var == null ? 0 : z1u0Var.hashCode());
    }
}
