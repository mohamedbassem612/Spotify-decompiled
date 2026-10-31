package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y960 implements da60 {
    public final k37 a;
    public final k37 b;

    public y960(k37 k37Var, k37 k37Var2) {
        this.a = k37Var;
        this.b = k37Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y960)) {
            return false;
        }
        y960 y960Var = (y960) obj;
        return this.a.equals(y960Var.a) && this.b.equals(y960Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
