package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c2s0 {
    public final String a;
    public final uqo b;
    public final int c;
    public final h2s0 d;
    public final boolean e;
    public final l2s0 f;
    public final lax g;

    public c2s0(b2s0 b2s0Var, a2s0 a2s0Var) {
        gax gaxVar;
        String str = b2s0Var.a;
        uqo uqoVar = b2s0Var.b;
        int i = b2s0Var.d;
        h2s0 h2s0Var = b2s0Var.f;
        boolean z = a2s0Var != null ? a2s0Var.a : false;
        l2s0 l2s0Var = (a2s0Var == null || (l2s0Var = a2s0Var.b) == null) ? k2s0.a : l2s0Var;
        if (a2s0Var == null) {
            gaxVar = new gax(2131961690, (String) null);
        } else {
            gax gaxVar2 = a2s0Var.c;
            gaxVar = gaxVar2 instanceof gax ? gaxVar2 : a2s0Var.b instanceof k2s0 ? new gax(2131961689, (String) null) : iax.a;
        }
        this.a = str;
        this.b = uqoVar;
        this.c = i;
        this.d = h2s0Var;
        this.e = z;
        this.f = l2s0Var;
        this.g = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2s0)) {
            return false;
        }
        c2s0 c2s0Var = (c2s0) obj;
        return this.a.equals(c2s0Var.a) && this.b.equals(c2s0Var.b) && this.c == c2s0Var.c && u890.j(this.d, c2s0Var.d) && this.e == c2s0Var.e && this.f.equals(c2s0Var.f) && this.g.equals(c2s0Var.g);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        h2s0 h2s0Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + xcg1.g((iF + (h2s0Var == null ? 0 : h2s0Var.hashCode())) * 31, 31, this.e)) * 31);
    }
}
