package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a991 {
    public final pa91 a;
    public final String b;
    public final iu30 c;

    public a991(pa91 pa91Var, String str, iu30 iu30Var) {
        this.a = pa91Var;
        this.b = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a991)) {
            return false;
        }
        a991 a991Var = (a991) obj;
        return this.a.equals(a991Var.a) && u890.j(this.b, a991Var.b) && u890.j(this.c, a991Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(-1554554593, 31, this.b);
    }
}
