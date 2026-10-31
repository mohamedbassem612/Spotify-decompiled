package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gzu {
    public final jfx0 a;
    public final boolean b;
    public final long c;

    public gzu(jfx0 jfx0Var, boolean z, long j) {
        this.a = jfx0Var;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzu)) {
            return false;
        }
        gzu gzuVar = (gzu) obj;
        return u890.j(this.a, gzuVar.a) && this.b == gzuVar.b && jfv.f(this.c, gzuVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        ytw0 ytw0Var = jfv.b;
        return Long.hashCode(this.c) + iG;
    }
}
