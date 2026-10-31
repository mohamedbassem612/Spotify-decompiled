package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yh01 implements bi01 {
    public final long a;

    public yh01(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh01) && jfv.f(this.a, ((yh01) obj).a);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.a);
    }
}
