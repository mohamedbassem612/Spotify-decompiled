package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kj71 extends pj71 {
    public final rj71 a;
    public final pj71 b;
    public final pj71 c;

    public kj71(rj71 rj71Var, pj71 pj71Var, pj71 pj71Var2) {
        this.a = rj71Var;
        this.b = pj71Var;
        this.c = pj71Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj71)) {
            return false;
        }
        kj71 kj71Var = (kj71) obj;
        return u890.j(this.a, kj71Var.a) && u890.j(this.b, kj71Var.b) && this.c.equals(kj71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
