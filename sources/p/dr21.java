package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dr21 {
    public final j6k a;
    public final lhe0 b;

    public dr21(j6k j6kVar, lhe0 lhe0Var) {
        this.a = j6kVar;
        this.b = lhe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr21)) {
            return false;
        }
        dr21 dr21Var = (dr21) obj;
        return this.a.equals(dr21Var.a) && this.b.equals(dr21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
