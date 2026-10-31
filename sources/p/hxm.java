package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hxm {
    public final String a;
    public final long b;

    public hxm(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxm)) {
            return false;
        }
        hxm hxmVar = (hxm) obj;
        if (!u890.j(this.a, hxmVar.a)) {
            return false;
        }
        long j = hxmVar.b;
        int i = u7h.l;
        return z4h1.b(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return Long.hashCode(this.b) + iHashCode;
    }
}
