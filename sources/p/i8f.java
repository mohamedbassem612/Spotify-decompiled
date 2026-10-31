package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i8f extends j8f {
    public final String b;
    public final long c;
    public final long d;
    public final String e;

    public i8f(long j, long j2, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8f)) {
            return false;
        }
        i8f i8fVar = (i8f) obj;
        return u890.j(this.b, i8fVar.b) && this.c == i8fVar.c && this.d == i8fVar.d && this.e.equals(i8fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(cy30.f(this.b.hashCode() * 31, this.c, 31), this.d, 31);
    }

    @Override // p.b9f
    public final String r() {
        return this.e;
    }

    @Override // p.b9f
    public final String s() {
        return this.b;
    }

    @Override // p.b9f
    public final long t() {
        return this.c;
    }

    @Override // p.j8f
    public final long u() {
        return this.d;
    }
}
