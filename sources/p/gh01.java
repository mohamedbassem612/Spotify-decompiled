package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gh01 extends tto1 {
    public final long b;

    public gh01(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh01) && jfv.f(this.b, ((gh01) obj).b);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b);
    }

    public final long m() {
        return this.b;
    }
}
