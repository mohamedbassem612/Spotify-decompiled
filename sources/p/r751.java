package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r751 {
    public final d8r0 a;
    public final u211 b;
    public final int c;

    public r751(d8r0 d8r0Var, u211 u211Var, int i) {
        this.a = d8r0Var;
        this.b = u211Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r751)) {
            return false;
        }
        r751 r751Var = (r751) obj;
        return this.a.equals(r751Var.a) && u890.j(this.b, r751Var.b) && this.c == r751Var.c;
    }

    public final int hashCode() {
        return l1d.C(2) + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
