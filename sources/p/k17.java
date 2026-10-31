package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k17 extends o17 {
    public final g07 a;
    public final z5t0 b = new z5t0(j4b1.n7);

    public k17(g07 g07Var) {
        this.a = g07Var;
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.b;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k17) && this.a.equals(((k17) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
