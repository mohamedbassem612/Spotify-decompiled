package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r8f extends s8f {
    public final String b;
    public final long c;
    public final String d;

    public r8f(long j, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8f)) {
            return false;
        }
        r8f r8fVar = (r8f) obj;
        return this.b.equals(r8fVar.b) && this.c == r8fVar.c && this.d.equals(r8fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(this.b.hashCode() * 31, this.c, 31);
    }

    @Override // p.b9f
    public final String r() {
        return this.d;
    }

    @Override // p.b9f
    public final String s() {
        return this.b;
    }

    @Override // p.b9f
    public final long t() {
        return this.c;
    }
}
