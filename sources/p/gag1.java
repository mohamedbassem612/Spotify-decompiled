package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gag1 {
    public final kcg1 a;
    public final long b;

    public gag1(kcg1 kcg1Var, long j) {
        this.a = kcg1Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gag1)) {
            return false;
        }
        gag1 gag1Var = (gag1) obj;
        return this.a.equals(gag1Var.a) && this.b == gag1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }
}
