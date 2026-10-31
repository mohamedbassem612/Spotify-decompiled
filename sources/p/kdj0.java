package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kdj0 {
    public final int a;
    public final c3j0 b;
    public final y2j0 c;

    public kdj0(int i, c3j0 c3j0Var, y2j0 y2j0Var) {
        this.a = i;
        this.b = c3j0Var;
        this.c = y2j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdj0)) {
            return false;
        }
        kdj0 kdj0Var = (kdj0) obj;
        return this.a == kdj0Var.a && u890.j(this.b, kdj0Var.b) && u890.j(this.c, kdj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (l1d.C(this.a) * 31)) * 31);
    }
}
