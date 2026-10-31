package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sxb1 {
    public final jo70 a;
    public final xkk1 b;

    public sxb1(jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxb1)) {
            return false;
        }
        sxb1 sxb1Var = (sxb1) obj;
        return this.a.equals(sxb1Var.a) && this.b.equals(sxb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
