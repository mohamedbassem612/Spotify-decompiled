package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class grn0 extends irn0 {
    public final brm1 a;

    public grn0(brm1 brm1Var) {
        this.a = brm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof grn0) && this.a.equals(((grn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
