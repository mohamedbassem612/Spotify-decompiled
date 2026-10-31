package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tcz {
    public final iix0 a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final boolean e;
    public final j8z f;

    public tcz(iix0 iix0Var, boolean z, boolean z2, Long l, boolean z3, j8z j8zVar) {
        this.a = iix0Var;
        this.b = z;
        this.c = z2;
        this.d = l;
        this.e = z3;
        this.f = j8zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcz)) {
            return false;
        }
        tcz tczVar = (tcz) obj;
        return u890.j(this.a, tczVar.a) && this.b == tczVar.b && this.c == tczVar.c && u890.j(this.d, tczVar.d) && this.e == tczVar.e && u890.j(this.f, tczVar.f);
    }

    public final int hashCode() {
        iix0 iix0Var = this.a;
        int iG = xcg1.g(xcg1.g((iix0Var == null ? 0 : iix0Var.hashCode()) * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iG2 = xcg1.g((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.e);
        j8z j8zVar = this.f;
        return iG2 + (j8zVar != null ? j8zVar.hashCode() : 0);
    }
}
