package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bop0 {
    public final int a;
    public final String b;
    public final ioj0 c;

    public bop0(int i, String str, ioj0 ioj0Var) {
        this.a = i;
        this.b = str;
        this.c = ioj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bop0)) {
            return false;
        }
        bop0 bop0Var = (bop0) obj;
        return this.a == bop0Var.a && this.b.equals(bop0Var.b) && u890.j(this.c, bop0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
