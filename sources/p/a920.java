package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a920 {
    public final k620 a;
    public final c380 b;
    public final iu30 c;

    public a920(k620 k620Var, c380 c380Var, iu30 iu30Var) {
        this.a = k620Var;
        this.b = c380Var;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a920)) {
            return false;
        }
        a920 a920Var = (a920) obj;
        return this.a == a920Var.a && u890.j(this.b, a920Var.b) && u890.j(this.c, a920Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
