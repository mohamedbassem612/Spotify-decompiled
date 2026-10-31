package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a9g1 implements d9g1 {
    public final jyv0 a;

    public a9g1(jyv0 jyv0Var) {
        this.a = jyv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9g1) && this.a.equals(((a9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
