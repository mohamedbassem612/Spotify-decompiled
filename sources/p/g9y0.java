package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g9y0 implements i9y0 {
    public final String a;
    public final h7y0 b;

    public g9y0(String str, h7y0 h7y0Var) {
        this.a = str;
        this.b = h7y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9y0)) {
            return false;
        }
        g9y0 g9y0Var = (g9y0) obj;
        return u890.j(this.a, g9y0Var.a) && u890.j(this.b, g9y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
