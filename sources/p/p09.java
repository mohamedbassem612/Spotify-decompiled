package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p09 {
    public final o19 a;
    public final o19 b;

    public p09(o19 o19Var, o19 o19Var2) {
        this.a = o19Var;
        this.b = o19Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p09)) {
            return false;
        }
        p09 p09Var = (p09) obj;
        return this.a.equals(p09Var.a) && this.b.equals(p09Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
