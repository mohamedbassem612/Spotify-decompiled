package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s4v0 extends u4v0 {
    public final String a;
    public final op80 b;
    public final hgi0 c;

    public s4v0(String str, op80 op80Var, hgi0 hgi0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = hgi0Var;
    }

    @Override // p.rt50
    public final hgi0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4v0)) {
            return false;
        }
        s4v0 s4v0Var = (s4v0) obj;
        return this.a.equals(s4v0Var.a) && this.b.equals(s4v0Var.b) && this.c.equals(s4v0Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
