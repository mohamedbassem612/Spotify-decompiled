package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a2f {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public a2f(int i, int i2, long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2f)) {
            return false;
        }
        a2f a2fVar = (a2f) obj;
        return this.a.equals(a2fVar.a) && this.b.equals(a2fVar.b) && this.c == a2fVar.c && this.d == a2fVar.d && this.e == a2fVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
