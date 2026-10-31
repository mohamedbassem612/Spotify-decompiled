package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class suc implements tuc {
    public final mvh1 a;

    public suc(mvh1 mvh1Var) {
        this.a = mvh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suc) && u890.j(this.a, ((suc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
