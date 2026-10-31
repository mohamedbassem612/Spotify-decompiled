package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xwa0 {
    public final mwr0 a;
    public final mwr0 b;
    public final yxa0 c;
    public final tv80 d;

    public xwa0(mwr0 mwr0Var, mwr0 mwr0Var2, yxa0 yxa0Var, tv80 tv80Var) {
        this.a = mwr0Var;
        this.b = mwr0Var2;
        this.c = yxa0Var;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwa0)) {
            return false;
        }
        xwa0 xwa0Var = (xwa0) obj;
        return u890.j(this.a, xwa0Var.a) && u890.j(this.b, xwa0Var.b) && u890.j(this.c, xwa0Var.c) && u890.j(this.d, xwa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
