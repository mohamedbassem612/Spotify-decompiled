package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wgx {
    public final long a;
    public final long b;

    public wgx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgx)) {
            return false;
        }
        wgx wgxVar = (wgx) obj;
        long j = wgxVar.a;
        int i = u7h.l;
        return z4h1.b(this.a, j) && z4h1.b(this.b, wgxVar.b);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.b) + (z4h1.c(this.a) * 31);
    }
}
