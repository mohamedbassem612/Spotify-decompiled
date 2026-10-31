package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lh00 extends mh00 {
    public final rod0 a;
    public final long b;

    public lh00(rod0 rod0Var, long j) {
        this.a = rod0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh00)) {
            return false;
        }
        lh00 lh00Var = (lh00) obj;
        return this.a.equals(lh00Var.a) && this.b == lh00Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
