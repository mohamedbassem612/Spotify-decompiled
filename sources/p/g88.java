package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g88 {
    public final ph1 a;
    public final String b;

    public g88(ph1 ph1Var, String str) {
        this.a = ph1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g88)) {
            return false;
        }
        g88 g88Var = (g88) obj;
        return this.a == g88Var.a && this.b.equals(g88Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
