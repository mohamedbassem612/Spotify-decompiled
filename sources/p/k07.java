package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k07 extends o17 {
    public final g07 a;
    public final boolean b;
    public final z5t0 c = new z5t0(j4b1.O0);

    public k07(g07 g07Var, boolean z) {
        this.a = g07Var;
        this.b = z;
    }

    @Override // p.o17
    public final g07 a() {
        return this.a;
    }

    @Override // p.o17
    public final m5n1 b() {
        return this.c;
    }

    @Override // p.o17
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k07)) {
            return false;
        }
        k07 k07Var = (k07) obj;
        return u890.j(this.a, k07Var.a) && this.b == k07Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
