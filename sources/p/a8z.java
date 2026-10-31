package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a8z extends b8z {
    public final String a;
    public final boolean b;
    public final long c;
    public final long d;

    public a8z(long j, long j2, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8z)) {
            return false;
        }
        a8z a8zVar = (a8z) obj;
        return u890.j(this.a, a8zVar.a) && this.b == a8zVar.b && this.c == a8zVar.c && this.d == a8zVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(xcg1.g(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
