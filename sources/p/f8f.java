package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f8f extends h8f {
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public f8f(long j, long j2, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8f)) {
            return false;
        }
        f8f f8fVar = (f8f) obj;
        return u890.j(this.b, f8fVar.b) && this.c == f8fVar.c && this.d == f8fVar.d && this.e.equals(f8fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(this.b.hashCode() * 31, this.c, 31), this.d, 31);
    }

    @Override // p.h8f
    public final String x() {
        return this.e;
    }
}
