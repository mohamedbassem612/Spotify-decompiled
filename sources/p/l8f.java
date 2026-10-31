package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l8f extends m8f {
    public final String b;
    public final long c;
    public final String d;

    public l8f(long j, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8f)) {
            return false;
        }
        l8f l8fVar = (l8f) obj;
        return this.b.equals(l8fVar.b) && this.c == l8fVar.c && this.d.equals(l8fVar.d);
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
