package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dn41 {
    public final gp80 a;
    public final yue0 b;
    public final boolean c;
    public final tn41 d;

    public dn41(gp80 gp80Var, int i) {
        bjx0 bjx0Var = xju.a;
        yue0 yue0VarI = ucp1.i();
        bjx0Var = (i & 8) != 0 ? bjx0.i : bjx0Var;
        this.a = gp80Var;
        this.b = yue0VarI;
        this.c = false;
        this.d = bjx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dn41) {
            dn41 dn41Var = (dn41) obj;
            if (this.a.equals(dn41Var.a) && this.b == dn41Var.b && this.c == dn41Var.c && this.d.equals(dn41Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
