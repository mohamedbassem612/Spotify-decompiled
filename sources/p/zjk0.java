package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zjk0 implements ikk0 {
    public final r920 a;
    public final r920 b;
    public final int c;
    public final ha20 d;

    public zjk0(r920 r920Var, r920 r920Var2, int i, ha20 ha20Var) {
        this.a = r920Var;
        this.b = r920Var2;
        this.c = i;
        this.d = ha20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjk0)) {
            return false;
        }
        zjk0 zjk0Var = (zjk0) obj;
        return u890.j(this.a, zjk0Var.a) && u890.j(this.b, zjk0Var.b) && this.c == zjk0Var.c && this.d == zjk0Var.d;
    }

    public final int hashCode() {
        r920 r920Var = this.a;
        int iHashCode = (r920Var == null ? 0 : r920Var.hashCode()) * 31;
        r920 r920Var2 = this.b;
        int iF = kaa0.f(this.c, (iHashCode + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31, 31);
        ha20 ha20Var = this.d;
        return iF + (ha20Var != null ? ha20Var.hashCode() : 0);
    }
}
