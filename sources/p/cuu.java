package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cuu {
    public final h2v a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final fuu f;

    public cuu(h2v h2vVar, boolean z, boolean z2, String str, boolean z3, fuu fuuVar) {
        this.a = h2vVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = fuuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuu)) {
            return false;
        }
        cuu cuuVar = (cuu) obj;
        return this.a.equals(cuuVar.a) && this.b == cuuVar.b && this.c == cuuVar.c && u890.j(this.d, cuuVar.d) && this.e == cuuVar.e && this.f.equals(cuuVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
