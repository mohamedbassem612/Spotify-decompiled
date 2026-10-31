package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b3f implements q3f {
    public final String a;
    public final long b;

    public b3f(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3f)) {
            return false;
        }
        b3f b3fVar = (b3f) obj;
        return u890.j(this.a, b3fVar.a) && this.b == b3fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
