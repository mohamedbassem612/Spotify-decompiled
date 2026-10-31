package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aj6 implements bj6 {
    public final dj6 a;
    public final wi6 b;

    public aj6(dj6 dj6Var, wi6 wi6Var) {
        this.a = dj6Var;
        this.b = wi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj6)) {
            return false;
        }
        aj6 aj6Var = (aj6) obj;
        return u890.j(this.a, aj6Var.a) && this.b.equals(aj6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
