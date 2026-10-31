package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ns60 {
    public final ps60 a;
    public final ps60 b;
    public final lp90 c;
    public final String d;
    public final j16 e;

    public ns60(ps60 ps60Var, ps60 ps60Var2, lp90 lp90Var, String str, j16 j16Var) {
        this.a = ps60Var;
        this.b = ps60Var2;
        this.c = lp90Var;
        this.d = str;
        this.e = j16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns60)) {
            return false;
        }
        ns60 ns60Var = (ns60) obj;
        return u890.j(this.a, ns60Var.a) && u890.j(this.b, ns60Var.b) && this.c.equals(ns60Var.c) && u890.j(this.d, ns60Var.d) && this.e == ns60Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
