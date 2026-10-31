package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uob {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;

    public uob(long j, long j2, long j3, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uob)) {
            return false;
        }
        uob uobVar = (uob) obj;
        return this.a.equals(uobVar.a) && this.b == uobVar.b && this.c == uobVar.c && this.d.equals(uobVar.d) && this.e == uobVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }
}
