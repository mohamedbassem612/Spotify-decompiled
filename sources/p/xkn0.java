package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xkn0 implements qq60 {
    public final zkn0 a;
    public final String b;
    public final op80 c;

    public xkn0(zkn0 zkn0Var, String str, op80 op80Var) {
        this.a = zkn0Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkn0)) {
            return false;
        }
        xkn0 xkn0Var = (xkn0) obj;
        return this.a.equals(xkn0Var.a) && this.b.equals(xkn0Var.b) && this.c.equals(xkn0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
