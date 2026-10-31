package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dbd1 implements hbd1 {
    public final iu30 a;
    public final boolean b;
    public final boolean c;
    public final xu30 d;
    public final String e;

    public dbd1(iu30 iu30Var, xu30 xu30Var, int i) {
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        xu30Var = (i & 8) != 0 ? xi81.W0 : xu30Var;
        this.a = iu30Var;
        this.b = z;
        this.c = z2;
        this.d = xu30Var;
        this.e = (String) iu30Var.invoke(huw0.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbd1)) {
            return false;
        }
        dbd1 dbd1Var = (dbd1) obj;
        return this.a.equals(dbd1Var.a) && this.b == dbd1Var.b && this.c == dbd1Var.c && this.d.equals(dbd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
