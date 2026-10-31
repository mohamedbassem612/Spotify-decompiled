package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fp10 {
    public final String a;
    public final ap10 b;
    public final iu30 c;

    public fp10(String str, ap10 ap10Var, iu30 iu30Var) {
        this.a = str;
        this.b = ap10Var;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp10)) {
            return false;
        }
        fp10 fp10Var = (fp10) obj;
        return u890.j(this.a, fp10Var.a) && this.b.equals(fp10Var.b) && u890.j(this.c, fp10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
