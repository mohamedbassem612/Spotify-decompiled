package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xo80 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final wo80 c;

    public xo80(String str, d8r0 d8r0Var, wo80 wo80Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = wo80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo80)) {
            return false;
        }
        xo80 xo80Var = (xo80) obj;
        return this.a.equals(xo80Var.a) && this.b.equals(xo80Var.b) && this.c.equals(xo80Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
