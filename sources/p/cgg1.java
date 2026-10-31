package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cgg1 {
    public final af5 a;
    public final hyp0 b;

    public cgg1(af5 af5Var, hyp0 hyp0Var) {
        this.a = af5Var;
        this.b = hyp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgg1)) {
            return false;
        }
        cgg1 cgg1Var = (cgg1) obj;
        return u890.j(this.a, cgg1Var.a) && this.b.equals(cgg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ")";
    }
}
