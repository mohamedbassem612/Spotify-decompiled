package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q6j1 implements qq60 {
    public final n6j1 a;
    public final String b;
    public final op80 c;

    public q6j1(n6j1 n6j1Var, String str, op80 op80Var) {
        this.a = n6j1Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6j1)) {
            return false;
        }
        q6j1 q6j1Var = (q6j1) obj;
        return this.a.equals(q6j1Var.a) && this.b.equals(q6j1Var.b) && this.c.equals(q6j1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
