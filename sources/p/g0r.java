package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g0r implements h0r {
    public final Throwable a;

    public g0r(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0r) && this.a.equals(((g0r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
