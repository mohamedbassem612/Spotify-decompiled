package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rl41 implements ul41 {
    public final mvh1 a;

    public rl41(mvh1 mvh1Var) {
        this.a = mvh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl41) && u890.j(this.a, ((rl41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
