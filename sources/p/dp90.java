package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dp90 {
    public final long a;
    public final int b;
    public final cp90 c;

    public dp90(long j, int i, cp90 cp90Var) {
        this.a = j;
        this.b = i;
        this.c = cp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp90)) {
            return false;
        }
        dp90 dp90Var = (dp90) obj;
        return this.a == dp90Var.a && this.b == dp90Var.b && u890.j(this.c, dp90Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, Long.hashCode(this.a) * 31, 31);
        cp90 cp90Var = this.c;
        return iK + (cp90Var == null ? 0 : cp90Var.hashCode());
    }
}
