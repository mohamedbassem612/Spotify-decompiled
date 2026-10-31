package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d17 extends o17 {
    public final g07 a;
    public final j4b1 b;
    public final z5t0 c;

    public d17(g07 g07Var, j4b1 j4b1Var) {
        this.a = g07Var;
        this.b = j4b1Var;
        this.c = new z5t0(j4b1Var);
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.c;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d17)) {
            return false;
        }
        d17 d17Var = (d17) obj;
        return this.a.equals(d17Var.a) && this.b == d17Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
