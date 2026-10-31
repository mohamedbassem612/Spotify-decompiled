package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hdr0 {
    public final String a;
    public final long b;

    public hdr0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdr0)) {
            return false;
        }
        hdr0 hdr0Var = (hdr0) obj;
        return this.a.equals(hdr0Var.a) && jfv.f(this.b, hdr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.b) + iHashCode;
    }
}
