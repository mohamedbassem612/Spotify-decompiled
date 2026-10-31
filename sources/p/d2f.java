package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d2f implements q3f {
    public final String a;
    public final long b;

    public d2f(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2f)) {
            return false;
        }
        d2f d2fVar = (d2f) obj;
        return u890.j(this.a, d2fVar.a) && this.b == d2fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
