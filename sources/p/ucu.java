package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ucu implements vcu {
    public final String a;
    public final long b;

    public ucu(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucu)) {
            return false;
        }
        ucu ucuVar = (ucu) obj;
        return this.a.equals(ucuVar.a) && this.b == ucuVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
