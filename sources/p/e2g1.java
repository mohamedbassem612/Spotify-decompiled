package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e2g1 {
    public final d2g1 a;
    public final boolean b;
    public final c380 c;

    public e2g1(d2g1 d2g1Var, boolean z, c380 c380Var) {
        this.a = d2g1Var;
        this.b = z;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2g1)) {
            return false;
        }
        e2g1 e2g1Var = (e2g1) obj;
        return this.a.equals(e2g1Var.a) && this.b == e2g1Var.b && u890.j(this.c, e2g1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
