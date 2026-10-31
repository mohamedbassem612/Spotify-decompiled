package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dvu0 {
    public final cvu0 a;
    public final boolean b;
    public final iu30 c;

    public dvu0(cvu0 cvu0Var, boolean z, iu30 iu30Var) {
        this.a = cvu0Var;
        this.b = z;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvu0)) {
            return false;
        }
        dvu0 dvu0Var = (dvu0) obj;
        return this.a.equals(dvu0Var.a) && this.b == dvu0Var.b && u890.j(this.c, dvu0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
