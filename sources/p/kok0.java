package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kok0 {
    public final iok0 a;
    public final jok0 b;

    public kok0(iok0 iok0Var, jok0 jok0Var) {
        this.a = iok0Var;
        this.b = jok0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kok0)) {
            return false;
        }
        kok0 kok0Var = (kok0) obj;
        return u890.j(this.a, kok0Var.a) && u890.j(this.b, kok0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
