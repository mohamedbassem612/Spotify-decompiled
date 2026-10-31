package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n9g1 implements p9g1 {
    public final jyv0 a;

    public n9g1(jyv0 jyv0Var) {
        this.a = jyv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9g1) && this.a.equals(((n9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
