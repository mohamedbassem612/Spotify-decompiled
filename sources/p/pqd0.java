package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pqd0 extends rqd0 {
    public final qqd0 a;

    public pqd0(qqd0 qqd0Var) {
        this.a = qqd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqd0) && this.a.equals(((pqd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
