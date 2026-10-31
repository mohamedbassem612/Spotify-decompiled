package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hye {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public hye(int i, int i2, long j, String str, String str2) {
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
        if (!(obj instanceof hye)) {
            return false;
        }
        hye hyeVar = (hye) obj;
        return u890.j(this.a, hyeVar.a) && u890.j(this.b, hyeVar.b) && this.c == hyeVar.c && this.d == hyeVar.d && this.e == hyeVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
