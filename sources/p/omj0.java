package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class omj0 implements pmj0 {
    public final afv0 a;

    public omj0(afv0 afv0Var) {
        this.a = afv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof omj0) && this.a.equals(((omj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
