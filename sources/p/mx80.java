package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mx80 implements qq60 {
    public final ky80 a;
    public final String b;
    public final op80 c;

    public mx80(ky80 ky80Var, String str, op80 op80Var) {
        this.a = ky80Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx80)) {
            return false;
        }
        mx80 mx80Var = (mx80) obj;
        return this.a.equals(mx80Var.a) && this.b.equals(mx80Var.b) && this.c.equals(mx80Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
