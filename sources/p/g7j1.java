package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g7j1 implements o7j1 {
    public final ji0 a;
    public final String b;

    public g7j1(String str, ji0 ji0Var) {
        this.a = ji0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7j1)) {
            return false;
        }
        g7j1 g7j1Var = (g7j1) obj;
        return u890.j(this.a, g7j1Var.a) && this.b.equals(g7j1Var.b);
    }

    public final int hashCode() {
        ji0 ji0Var = this.a;
        return this.b.hashCode() + ((ji0Var == null ? 0 : ji0Var.hashCode()) * 31);
    }
}
