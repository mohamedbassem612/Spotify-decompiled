package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p8m0 implements q8m0 {
    public final ku1 a;

    public p8m0(ku1 ku1Var) {
        this.a = ku1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8m0) && this.a == ((p8m0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
