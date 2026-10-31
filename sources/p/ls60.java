package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ls60 implements ms60 {
    public final ps60 a;
    public final ks60 b;

    public ls60(ps60 ps60Var, ks60 ks60Var) {
        this.a = ps60Var;
        this.b = ks60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls60)) {
            return false;
        }
        ls60 ls60Var = (ls60) obj;
        return this.a.equals(ls60Var.a) && this.b.equals(ls60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
