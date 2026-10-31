package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ed20 {
    public final c380 a;
    public final dd20 b;

    public ed20(c9 c9Var, dd20 dd20Var) {
        this.a = c9Var;
        this.b = dd20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed20)) {
            return false;
        }
        ed20 ed20Var = (ed20) obj;
        return this.a.equals(ed20Var.a) && this.b.equals(ed20Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, false);
    }
}
