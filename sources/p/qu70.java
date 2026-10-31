package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qu70 implements qq60 {
    public final hv70 a;
    public final String b;
    public final op80 c;

    public qu70(hv70 hv70Var, String str, op80 op80Var) {
        this.a = hv70Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu70)) {
            return false;
        }
        qu70 qu70Var = (qu70) obj;
        return this.a.equals(qu70Var.a) && this.b.equals(qu70Var.b) && this.c.equals(qu70Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
