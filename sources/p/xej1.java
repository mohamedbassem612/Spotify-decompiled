package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xej1 {
    public final bbl1 a;
    public final bbl1 b;

    public xej1(bbl1 bbl1Var, bbl1 bbl1Var2) {
        this.a = bbl1Var;
        this.b = bbl1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xej1)) {
            return false;
        }
        xej1 xej1Var = (xej1) obj;
        return this.a.equals(xej1Var.a) && this.b.equals(xej1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
