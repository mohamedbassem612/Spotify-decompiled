package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ttg0 {
    public final m0u0 a;
    public final otg0 b;

    public ttg0(m0u0 m0u0Var, otg0 otg0Var) {
        this.a = m0u0Var;
        this.b = otg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttg0)) {
            return false;
        }
        ttg0 ttg0Var = (ttg0) obj;
        return this.a.equals(ttg0Var.a) && this.b.equals(ttg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
