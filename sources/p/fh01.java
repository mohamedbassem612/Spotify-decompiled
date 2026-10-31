package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fh01 extends tto1 {
    public final long b;

    public fh01(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh01) && jfv.f(this.b, ((fh01) obj).b);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b);
    }

    public final long m() {
        return this.b;
    }
}
