package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s7f implements u7f {
    public final String a;
    public final h290 b;
    public final String c;
    public final int d;
    public final long e;

    public s7f(String str, h290 h290Var, String str2, int i, long j) {
        this.a = str;
        this.b = h290Var;
        this.c = str2;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7f)) {
            return false;
        }
        s7f s7fVar = (s7f) obj;
        return this.a.equals(s7fVar.a) && this.b.equals(s7fVar.b) && this.c.equals(s7fVar.c) && this.d == s7fVar.d && this.e == s7fVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ab80.k(this.d, cy30.d(kk0.g(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }
}
