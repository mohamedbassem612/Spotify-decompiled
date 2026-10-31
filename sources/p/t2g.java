package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t2g implements v2g {
    public final boolean a;
    public final boolean b;
    public final qex c;

    public t2g(boolean z, boolean z2, qex qexVar, int i) {
        z2 = (i & 2) != 0 ? false : z2;
        qexVar = (i & 4) != 0 ? null : qexVar;
        this.a = z;
        this.b = z2;
        this.c = qexVar;
    }

    @Override // p.v2g
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2g)) {
            return false;
        }
        t2g t2gVar = (t2g) obj;
        return this.a == t2gVar.a && this.b == t2gVar.b && u890.j(this.c, t2gVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        qex qexVar = this.c;
        return iG + (qexVar == null ? 0 : qexVar.hashCode());
    }
}
