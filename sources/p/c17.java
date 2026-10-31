package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c17 extends o17 {
    public final g07 a;
    public final z5t0 b = new z5t0(j4b1.W5);

    public c17(g07 g07Var) {
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
        return (obj instanceof c17) && this.a.equals(((c17) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
