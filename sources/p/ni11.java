package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ni11 {
    public final f0g1 a;
    public final int b;
    public final tig0 c;

    public ni11(f0g1 f0g1Var, int i, tig0 tig0Var) {
        this.a = f0g1Var;
        this.b = i;
        this.c = tig0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni11)) {
            return false;
        }
        ni11 ni11Var = (ni11) obj;
        return this.a.equals(ni11Var.a) && this.b == ni11Var.b && this.c.equals(ni11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
