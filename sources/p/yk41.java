package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yk41 implements xpx0 {
    public final mvh1 a;

    public yk41(mvh1 mvh1Var) {
        this.a = mvh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk41) && u890.j(this.a, ((yk41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
