package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b2s0 {
    public final String a;
    public final uqo b;
    public final t1s0 c;
    public final int d;
    public final int e;
    public final h2s0 f;

    public b2s0(String str, uqo uqoVar, t1s0 t1s0Var, int i, int i2, h2s0 h2s0Var) {
        this.a = str;
        this.b = uqoVar;
        this.c = t1s0Var;
        this.d = i;
        this.e = i2;
        this.f = h2s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2s0)) {
            return false;
        }
        b2s0 b2s0Var = (b2s0) obj;
        return this.a.equals(b2s0Var.a) && this.b.equals(b2s0Var.b) && this.c.equals(b2s0Var.c) && this.d == b2s0Var.d && this.e == b2s0Var.e && u890.j(this.f, b2s0Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, kaa0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31);
        h2s0 h2s0Var = this.f;
        return iK + (h2s0Var == null ? 0 : h2s0Var.hashCode());
    }
}
