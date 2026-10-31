package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t9k implements u9k {
    public final String a;
    public final long b;

    public t9k(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9k)) {
            return false;
        }
        t9k t9kVar = (t9k) obj;
        return u890.j(this.a, t9kVar.a) && this.b == t9kVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
