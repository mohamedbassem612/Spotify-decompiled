package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sxg1 {
    public final vu30 a;
    public final vu30 b;

    public sxg1(vu30 vu30Var, vu30 vu30Var2) {
        this.a = vu30Var;
        this.b = vu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxg1)) {
            return false;
        }
        sxg1 sxg1Var = (sxg1) obj;
        return this.a.equals(sxg1Var.a) && this.b.equals(sxg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
