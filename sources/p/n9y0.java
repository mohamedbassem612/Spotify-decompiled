package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n9y0 {
    public final String a;
    public final m9y0 b;

    public n9y0(String str, m9y0 m9y0Var) {
        this.a = str;
        this.b = m9y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9y0)) {
            return false;
        }
        n9y0 n9y0Var = (n9y0) obj;
        return this.a.equals(n9y0Var.a) && u890.j(this.b, n9y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
