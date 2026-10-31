package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ep2 {
    public final faa0 a;
    public final boolean b;
    public final xu30 c;

    public ep2(faa0 faa0Var, boolean z, xu30 xu30Var) {
        this.a = faa0Var;
        this.b = z;
        this.c = xu30Var;
    }

    public static ep2 a(ep2 ep2Var) {
        faa0 faa0Var = ep2Var.a;
        xu30 xu30Var = ep2Var.c;
        ep2Var.getClass();
        return new ep2(faa0Var, true, xu30Var);
    }

    public final faa0 b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep2)) {
            return false;
        }
        ep2 ep2Var = (ep2) obj;
        return u890.j(this.a, ep2Var.a) && this.b == ep2Var.b && this.c.equals(ep2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
