package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r6m1 implements qq60 {
    public final a7m1 a;
    public final String b;
    public final op80 c;

    public r6m1(a7m1 a7m1Var, String str, op80 op80Var) {
        this.a = a7m1Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6m1)) {
            return false;
        }
        r6m1 r6m1Var = (r6m1) obj;
        return this.a.equals(r6m1Var.a) && this.b.equals(r6m1Var.b) && this.c.equals(r6m1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
