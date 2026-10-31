package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b7j1 implements qq60 {
    public final String a;
    public final op80 b;
    public final y8j1 c;

    public b7j1(String str, op80 op80Var, y8j1 y8j1Var) {
        this.a = str;
        this.b = op80Var;
        this.c = y8j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7j1)) {
            return false;
        }
        b7j1 b7j1Var = (b7j1) obj;
        return this.a.equals(b7j1Var.a) && this.b.equals(b7j1Var.b) && this.c.equals(b7j1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
