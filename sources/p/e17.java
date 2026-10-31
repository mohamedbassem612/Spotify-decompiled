package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e17 extends o17 {
    public final g07 a;
    public final z5t0 b = new z5t0(j4b1.A5);

    public e17(g07 g07Var) {
        this.a = g07Var;
    }

    @Override // p.o17
    public final g07 a() {
        return this.a;
    }

    @Override // p.o17
    public final m5n1 b() {
        return this.b;
    }

    @Override // p.o17
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e17) && this.a.equals(((e17) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }
}
