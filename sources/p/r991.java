package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r991 {
    public final ra91 a;
    public final String b;
    public final iu30 c;

    public r991(ra91 ra91Var, String str, iu30 iu30Var) {
        this.a = ra91Var;
        this.b = str;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r991)) {
            return false;
        }
        r991 r991Var = (r991) obj;
        return this.a.equals(r991Var.a) && u890.j(this.b, r991Var.b) && u890.j(this.c, r991Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.a.hashCode() * 31, 31, this.b);
    }
}
