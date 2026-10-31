package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s4g {
    public final String a;
    public final long b;
    public final long c;

    public s4g(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4g)) {
            return false;
        }
        s4g s4gVar = (s4g) obj;
        return this.a.equals(s4gVar.a) && this.b == s4gVar.b && this.c == s4gVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
