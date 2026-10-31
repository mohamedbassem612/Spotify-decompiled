package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class od80 implements qq60 {
    public final String a;
    public final op80 b;
    public final ne80 c;

    public od80(String str, op80 op80Var, ne80 ne80Var) {
        this.a = str;
        this.b = op80Var;
        this.c = ne80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od80)) {
            return false;
        }
        od80 od80Var = (od80) obj;
        return this.a.equals(od80Var.a) && this.b.equals(od80Var.b) && this.c.equals(od80Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
