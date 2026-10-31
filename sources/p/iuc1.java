package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iuc1 {
    public final bxc1 a;
    public final int b;
    public final qim0 c;
    public final iu30 d;

    public iuc1(bxc1 bxc1Var, int i, qim0 qim0Var, iu30 iu30Var) {
        this.a = bxc1Var;
        this.b = i;
        this.c = qim0Var;
        this.d = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuc1)) {
            return false;
        }
        iuc1 iuc1Var = (iuc1) obj;
        return u890.j(this.a, iuc1Var.a) && this.b == iuc1Var.b && u890.j(this.c, iuc1Var.c) && u890.j(this.d, iuc1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
