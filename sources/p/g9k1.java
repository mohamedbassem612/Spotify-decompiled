package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g9k1 implements t9k1 {
    public final boolean a;
    public final tv80 b;

    public g9k1(tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9k1)) {
            return false;
        }
        g9k1 g9k1Var = (g9k1) obj;
        return this.a == g9k1Var.a && u890.j(this.b, g9k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
