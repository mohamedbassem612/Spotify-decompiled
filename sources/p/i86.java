package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i86 implements m86 {
    public final mvh1 a;

    public i86(mvh1 mvh1Var) {
        this.a = mvh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i86) && u890.j(this.a, ((i86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
