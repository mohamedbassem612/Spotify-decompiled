package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g1c1 implements h1c1 {
    public final k1c1 a;

    public g1c1(k1c1 k1c1Var) {
        this.a = k1c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1c1) && this.a.equals(((g1c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
