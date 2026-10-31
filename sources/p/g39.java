package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g39 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final z39 d;

    public g39(String str, d8r0 d8r0Var, int i, z39 z39Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = z39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g39)) {
            return false;
        }
        g39 g39Var = (g39) obj;
        return this.a.equals(g39Var.a) && this.b.equals(g39Var.b) && this.c == g39Var.c && this.d.equals(g39Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
