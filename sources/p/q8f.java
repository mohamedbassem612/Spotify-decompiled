package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q8f extends s8f {
    public final String b;
    public final long c;
    public final String d;

    public q8f(long j, String str, String str2) {
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8f)) {
            return false;
        }
        q8f q8fVar = (q8f) obj;
        return this.b.equals(q8fVar.b) && this.c == q8fVar.c && this.d.equals(q8fVar.d);
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
