package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class csa1 {
    public final bsa1 a;

    public csa1(bsa1 bsa1Var) {
        this.a = bsa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csa1) && this.a.equals(((csa1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
