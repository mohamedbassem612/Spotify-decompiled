package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u4j0 extends a5j0 {
    public final pih1 a;

    public u4j0(pih1 pih1Var) {
        this.a = pih1Var;
    }

    @Override // p.a5j0
    public final pih1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4j0) && this.a.equals(((u4j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
