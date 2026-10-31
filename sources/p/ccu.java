package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ccu implements dcu {
    public final String a;
    public final long b;

    public ccu(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccu)) {
            return false;
        }
        ccu ccuVar = (ccu) obj;
        return this.a.equals(ccuVar.a) && this.b == ccuVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
