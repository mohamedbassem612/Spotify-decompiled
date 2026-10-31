package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xjb0 extends fsa {
    public final int a;
    public final j331 b;
    public final j331 c;

    public xjb0(int i, j331 j331Var, j331 j331Var2) {
        this.a = i;
        this.b = j331Var;
        this.c = j331Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjb0)) {
            return false;
        }
        xjb0 xjb0Var = (xjb0) obj;
        return this.a == xjb0Var.a && this.b.equals(xjb0Var.b) && this.c.equals(xjb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
