package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzg {
    public final knj1 a;

    public hzg(knj1 knj1Var) {
        this.a = knj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzg) && this.a == ((hzg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
