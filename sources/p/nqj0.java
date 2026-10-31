package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nqj0 {
    public final String a;
    public final yoj0 b;
    public final uqj0 c;

    public nqj0(String str, yoj0 yoj0Var, uqj0 uqj0Var) {
        this.a = str;
        this.b = yoj0Var;
        this.c = uqj0Var;
    }

    public final String a() {
        String str;
        String strF;
        yoj0 yoj0Var = this.b;
        if (!(yoj0Var instanceof xoj0)) {
            eg.o();
            return null;
        }
        fqj0 fqj0Var = ((xoj0) yoj0Var).b;
        if (u890.j(fqj0Var, eqj0.a)) {
            str = "sum";
        } else if (u890.j(fqj0Var, dqj0.a)) {
            str = "last";
        } else if (u890.j(fqj0Var, bqj0.a)) {
            str = "delta";
        } else {
            if (!(fqj0Var instanceof cqj0)) {
                eg.o();
                return null;
            }
            str = "histogram";
        }
        uqj0 uqj0Var = this.c;
        if (uqj0Var instanceof sqj0) {
            strF = gvg.f(((sqj0) uqj0Var).a, "global_", "s");
        } else {
            if (!uqj0Var.equals(tqj0.a)) {
                eg.o();
                return null;
            }
            strF = "observation";
        }
        return cy30.p(this.a, ".", str, ".", strF);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqj0)) {
            return false;
        }
        nqj0 nqj0Var = (nqj0) obj;
        return this.a.equals(nqj0Var.a) && this.b.equals(nqj0Var.b) && this.c.equals(nqj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
