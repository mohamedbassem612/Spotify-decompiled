package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a7g1 extends b7g1 {
    public final jo70 a;
    public final xkk1 b;
    public final hzy c;

    public a7g1(jo70 jo70Var, xkk1 xkk1Var, hzy hzyVar) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7g1)) {
            return false;
        }
        a7g1 a7g1Var = (a7g1) obj;
        return this.a.equals(a7g1Var.a) && this.b.equals(a7g1Var.b) && this.c.equals(a7g1Var.c);
    }

    public final int hashCode() {
        return l1d.C(this.c.a) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
