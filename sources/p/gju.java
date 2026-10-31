package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gju implements qzw {
    public final int a;
    public final a2x b;

    public gju(int i, a2x a2xVar) {
        this.a = i;
        this.b = a2xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gju)) {
            return false;
        }
        gju gjuVar = (gju) obj;
        return this.a == gjuVar.a && u890.j(this.b, gjuVar.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        a2x a2xVar = this.b;
        return iC + (a2xVar == null ? 0 : Long.hashCode(a2xVar.a));
    }
}
