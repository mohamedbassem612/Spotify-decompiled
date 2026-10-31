package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e8f extends g8f {
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public e8f(long j, long j2, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8f)) {
            return false;
        }
        e8f e8fVar = (e8f) obj;
        return u890.j(this.b, e8fVar.b) && this.c == e8fVar.c && this.d == e8fVar.d && this.e.equals(e8fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(this.b.hashCode() * 31, this.c, 31), this.d, 31);
    }

    public final String r() {
        return this.e;
    }

    public final String s() {
        return this.b;
    }

    public final long t() {
        return this.c;
    }

    public final long u() {
        return this.d;
    }
}
