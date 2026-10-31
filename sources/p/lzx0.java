package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lzx0 implements qq60 {
    public final wzx0 a;
    public final String b;
    public final op80 c;

    public lzx0(wzx0 wzx0Var, String str, op80 op80Var) {
        this.a = wzx0Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzx0)) {
            return false;
        }
        lzx0 lzx0Var = (lzx0) obj;
        return this.a.equals(lzx0Var.a) && this.b.equals(lzx0Var.b) && this.c.equals(lzx0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
