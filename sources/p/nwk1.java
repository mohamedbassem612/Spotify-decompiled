package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nwk1 implements rwk1 {
    public final mwk1 a;
    public final qwk1 b;
    public final pwk1 c;
    public final int d;
    public final String e;

    public nwk1(mwk1 mwk1Var, qwk1 qwk1Var, pwk1 pwk1Var, int i, String str) {
        this.a = mwk1Var;
        this.b = qwk1Var;
        this.c = pwk1Var;
        this.d = i;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwk1)) {
            return false;
        }
        nwk1 nwk1Var = (nwk1) obj;
        return u890.j(this.a, nwk1Var.a) && u890.j(this.b, nwk1Var.b) && u890.j(this.c, nwk1Var.c) && this.d == nwk1Var.d && u890.j(this.e, nwk1Var.e);
    }

    public final int getType() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pwk1 pwk1Var = this.c;
        return this.e.hashCode() + ab80.k(this.d, (iHashCode + (pwk1Var == null ? 0 : pwk1Var.hashCode())) * 31, 31);
    }

    public /* synthetic */ nwk1(lwk1 lwk1Var, qwk1 qwk1Var, int i) {
        this(lwk1Var, qwk1Var, null, i, "");
    }
}
