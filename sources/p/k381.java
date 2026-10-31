package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k381 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final e381 c;

    public k381(String str, d8r0 d8r0Var, e381 e381Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = e381Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k381)) {
            return false;
        }
        k381 k381Var = (k381) obj;
        return this.a.equals(k381Var.a) && this.b.equals(k381Var.b) && this.c.equals(k381Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
