package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ebd1 implements hbd1 {
    public final iu30 a;
    public final iu30 b;
    public final vu30 c;
    public final xu30 d;
    public final String e;

    public ebd1(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, xu30 xu30Var) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = vu30Var;
        this.d = xu30Var;
        this.e = (String) iu30Var.invoke(huw0.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebd1)) {
            return false;
        }
        ebd1 ebd1Var = (ebd1) obj;
        return u890.j(this.a, ebd1Var.a) && u890.j(this.b, ebd1Var.b) && u890.j(this.c, ebd1Var.c) && u890.j(this.d, ebd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + hrt.g(ktd.g(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public /* synthetic */ ebd1(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var) {
        this(iu30Var, iu30Var2, vu30Var, xi81.V0);
    }
}
