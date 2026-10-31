package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i4g1 {
    public final jf01 a;

    public final boolean equals(Object obj) {
        if (obj instanceof i4g1) {
            return this.a == ((i4g1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OkHttp(call=" + this.a + ")";
    }
}
