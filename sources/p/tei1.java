package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tei1 {
    public final oei1 a;
    public final sei1 b;

    public tei1(oei1 oei1Var, sei1 sei1Var) {
        this.a = oei1Var;
        this.b = sei1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tei1)) {
            return false;
        }
        tei1 tei1Var = (tei1) obj;
        return this.a.equals(tei1Var.a) && this.b.equals(tei1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
