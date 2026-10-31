package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g9e1 {
    public final caf1 a;
    public final daf1 b;

    public g9e1(caf1 caf1Var, daf1 daf1Var) {
        this.a = caf1Var;
        this.b = daf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9e1)) {
            return false;
        }
        g9e1 g9e1Var = (g9e1) obj;
        return this.a == g9e1Var.a && this.b == g9e1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
