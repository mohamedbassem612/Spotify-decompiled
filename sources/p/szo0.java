package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class szo0 {
    public final zob1 a;

    public szo0(zob1 zob1Var) {
        this.a = zob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szo0) && u890.j(this.a, ((szo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
