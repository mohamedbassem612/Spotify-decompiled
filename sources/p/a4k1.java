package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a4k1 implements c4k1 {
    public final qij1 a;

    public a4k1(qij1 qij1Var) {
        this.a = qij1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4k1) && this.a.equals(((a4k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
