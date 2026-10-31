package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bkk0 implements ikk0 {
    public final s69 a;
    public final s69 b;
    public final int c;
    public final duk1 d;

    public bkk0(s69 s69Var, s69 s69Var2, int i, duk1 duk1Var) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = i;
        this.d = duk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkk0)) {
            return false;
        }
        bkk0 bkk0Var = (bkk0) obj;
        return u890.j(this.a, bkk0Var.a) && u890.j(this.b, bkk0Var.b) && this.c == bkk0Var.c && this.d == bkk0Var.d;
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iF = kaa0.f(this.c, (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31, 31);
        duk1 duk1Var = this.d;
        return iF + (duk1Var != null ? duk1Var.hashCode() : 0);
    }
}
