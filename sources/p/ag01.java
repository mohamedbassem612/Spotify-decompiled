package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ag01 implements z291 {
    public final k291 a;

    public ag01(k291 k291Var) {
        this.a = k291Var;
    }

    @Override // p.z291
    public final Object a(lnm lnmVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag01) && this.a.equals(((ag01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.a + ')';
    }
}
