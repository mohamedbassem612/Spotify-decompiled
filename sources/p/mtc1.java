package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mtc1 {
    public final String a;
    public final int b;
    public final iu30 c;

    public mtc1(String str, int i, iu30 iu30Var) {
        this.a = str;
        this.b = i;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtc1)) {
            return false;
        }
        mtc1 mtc1Var = (mtc1) obj;
        return u890.j(this.a, mtc1Var.a) && this.b == mtc1Var.b && u890.j(this.c, mtc1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
