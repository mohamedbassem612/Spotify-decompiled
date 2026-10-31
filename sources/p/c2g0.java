package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c2g0 {
    public final ggr0 a;
    public final boolean b;

    public c2g0(ggr0 ggr0Var, boolean z) {
        this.a = ggr0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2g0)) {
            return false;
        }
        c2g0 c2g0Var = (c2g0) obj;
        return this.a.equals(c2g0Var.a) && this.b == c2g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
